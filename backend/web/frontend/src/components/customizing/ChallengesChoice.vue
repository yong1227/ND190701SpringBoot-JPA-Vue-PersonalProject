<template>
  <div>
    <Nav></Nav>
    <h2 align="center">챌린지 선택</h2>
    <b-list-group align="center">
      <b-list-group-item to="/Exercies">{{this.challengeName}}</b-list-group-item>
      
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
      challengeName: this.challengeName
    }
  },
  
  
};
</script>

<style scoped>
</style>