<template>
  <div>
    <Nav></Nav>
    <h2 align="center">챌린지 선택</h2>
    <b-list-group align="center">
      <b-list-group-item to="/atHome">집에서 살빼는 운동</b-list-group-item>
      <b-list-group-item to>회사에서 스트레칭</b-list-group-item>
      <b-list-group-item to="/threePart">3분할 트레이닝</b-list-group-item>
      <b-list-group-item to>살기 위한 최소한의 운동</b-list-group-item>
      <b-list-group-item to>10분 타바타 챌린지</b-list-group-item>
      <b-list-group-item to>20분 전신 운동</b-list-group-item>
      <b-list-group-item to>극강 프리웨이트</b-list-group-item>
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
