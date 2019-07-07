<template>
  <div>
    <Nav></Nav>
    <div>
      <h2>해당 운동 루틴</h2>
      <mdb-tbl responsive>
        <mdb-tbl-body>
          <tr><td >{{list.routineName1}}</td></tr>
          <tr><td >{{list.routineName2}}</td></tr> 
          <tr><td >{{list.routineName3}}</td></tr>
          <tr><td >{{list.routineName4}}</td></tr>
          <tr><td >{{list.routineName5}}</td></tr>
        </mdb-tbl-body>
      </mdb-tbl>
      <div align="right">
        <b-button variant="primary" @click="ExerciesUpdate(list)">수정</b-button>
        <b-button variant="success">도전</b-button>
      </div>
    </div>
    <Footer></Footer>
  </div>
</template>

<script>
import Nav from "@/components/common/Nav.vue";
import Footer from "@/components/common/Footer.vue";
import { mdbTbl, mdbTblHead, mdbTblBody } from "mdbvue";
import axios from "axios";
import { store } from "../../store";

export default {
  name: "TablePage",
  components: {
    Nav,
    Footer,
    mdbTbl,
    mdbTblHead,
    mdbTblBody
  },
  data() {
    return {
      context: "http://localhost:9000/challenges",
      list: []
    };
  },
  //챌린지 리스트 받아오기
  created() {
    axios
      .get(`${this.context}/find/`+this.$store.state.id)
      .then(res=>{
        this.list = res.data;
        this.$store.state.id = res.data.id;
        this.$store.state.routineName1 = res.data.routineName1;
        this.$store.state.routineName2 = res.data.routineName2;
        this.$store.state.routineName3 = res.data.routineName3;
        this.$store.state.routineName4 = res.data.routineName4;
        this.$store.state.routineName5 = res.data.routineName5;
      })
      .catch(e=>{
        alert('detail error')
        this.$router.link(-1)
      })
  },

  methods: {
    ExerciesUpdate(){
      this.$router.push('/ExerciesUpdate')
    }
  }
};
</script>

<style scoped>
</style>