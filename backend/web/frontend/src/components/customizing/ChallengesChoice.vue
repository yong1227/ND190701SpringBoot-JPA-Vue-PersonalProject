<template>
<div>
<Nav></Nav>
  <div>
    <h2>챌린지 선택</h2>
    <mdb-tbl responsive>
      <mdb-tbl-body>
        <tr v-for="item in list" :key="item.id">
          <td @click="exercies">{{item.challengeName}}</td> 
          <!-- <td @click="exercies">{{item.routineName1}}</td>  -->
        </tr>
      </mdb-tbl-body>
    </mdb-tbl>
  </div>
<Footer></Footer>
</div>
</template>

<script>
import Nav from "@/components/common/Nav.vue";
import Footer from "@/components/common/Footer.vue";
import { mdbTbl, mdbTblHead, mdbTblBody } from 'mdbvue';
import axios from 'axios';
import {store} from '../../store';

export default {
  name: 'TablePage',
  components: {
    Nav, Footer, mdbTbl, mdbTblHead, mdbTblBody
  },
  data(){
    return{
      context : 'http://localhost:9000/challenges',
      list:[]
    }
  },
  //챌린지 리스트 받아오기
  created(){
    axios.get(`${this.context}/findAll`)
    .then(res=>{
      this.list = res.data;
    })
    .catch(e=>{
      alert('error')
      this.$router.link(-1)
    })
  },
  // store(item){
    //   store.state.routineName1 = item.routineName1
  //   store.state.routineName2 = item.routineName2
  //   store.state.routineName3 = item.routineName3
  //   store.state.routineName4 = item.routineName4
  //   store.state.routineName5 = item.routineName5
  //   this.$router.push('/Exercies')
  // },
  methods:{
    exercies(e){
      //exercies로 이동
      this.$store.state.routineName1 = this.routineName1;
      this.$router.push('/Exercies')
    }
  }
};
</script>

<style scoped>
</style>