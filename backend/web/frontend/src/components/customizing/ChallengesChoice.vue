<template>
  <div>
    <Nav></Nav>
    <h2 align="center">챌린지 선택</h2>
    <b-list-group align="center">
      <b-list-group-item to="/Exercies"></b-list-group-item>
      
    </b-list-group>
    <Footer></Footer>
  </div>
</template>

<script>
import Nav from "@/components/common/Nav.vue";
import Footer from "@/components/common/Footer.vue";
import axios from 'axios';

export default {
  components: {
    Nav, Footer
  },
  data(){
    return{
      context : 'http://localhost:9000/challenges',
      
    }
  },
  //챌린지 이름만 다 뿌려주기
  created: {
    findAll(){
       axios.get(`${this.context}/findAll`)
       .then(res=>{
         alert('findAll 진입')
       })
       .catch(e=>{
         alert('error')
       })
    }
  }
  
  
};
</script>

<style scoped>
</style>