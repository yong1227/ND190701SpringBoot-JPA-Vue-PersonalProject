<template>
  <div>
    <Nav></Nav>
    <h2>집에서 살빼는 운동</h2>
    <b-list-group>
      <b-list-group-item to></b-list-group-item>
      <b-list-group-item to></b-list-group-item>
      <b-list-group-item to></b-list-group-item>
      <b-list-group-item to></b-list-group-item>
      <b-list-group-item to></b-list-group-item>
      <b-list-group-item to></b-list-group-item>
      <b-list-group-item to></b-list-group-item>
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
  }
};
</script>

<style scoped>
</style>
