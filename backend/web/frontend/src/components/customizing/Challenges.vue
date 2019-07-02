<template>
  <div>
    <Nav></Nav>
    <h2 align="center">챌린지 선택</h2>
    <b-list-group align="center">
      <b-list-group-item to="/Exercies">{{challengeName}}</b-list-group-item>
      
    </b-list-group>
    <Footer></Footer>
  </div>
</template>

<script>
import Nav from "@/components/common/Nav.vue";
import Footer from "@/components/common/Footer.vue";

export default {
  components: {
    Nav,
    Footer
  },
};
</script>

<style scoped>
</style>