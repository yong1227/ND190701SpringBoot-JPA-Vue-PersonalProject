<template>
<div>
<Nav></Nav>
  <div align="center">
    <h2>챌린지 선택</h2>
    <mdb-tbl responsive >
      <mdb-tbl-body >
        <tr v-for="item in list" :key="item.id">
          <!-- <td @click="exercies">{{item.id}}</td> -->
          <td @click="exercies(item.id)">{{item.challengeName}}</td>
          <td><b-button variant="success" @click="deleteChallenge(item.id)">삭제</b-button></td> 
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

  methods: {
    exercies(id){
      this.$store.state.id = id;
      this.$router.push('/Exercies')
    },
    deleteChallenge(id){
      axios
        .delete(`${this.context}/delete/`+id)
        .then(res=>{
          alert('삭제 성공')
          axios.get(`${this.context}/findAll`).then(res=>{this.list = res.data}).catch(e=>{aler('refind error')})
        })
        .catch(e=>{
          alert('delete axios error')
        })
    }
  },
};
</script>

<style scoped>
</style>