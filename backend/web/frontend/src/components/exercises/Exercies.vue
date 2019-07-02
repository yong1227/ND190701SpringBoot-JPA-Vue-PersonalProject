<template>
<div>
  <Nav></Nav>
  <h2 align="center">해당 운동 루틴</h2>
  <div>
    <b-table hover :items="items"></b-table>
    <div align="right">
      <b-button variant="primary">추가</b-button>
      <b-button variant="success">도전</b-button>
    </div>
  </div>
  <Footer></Footer>
</div>
</template>

<script>
import Nav from "@/components/common/Nav.vue";
import Footer from "@/components/common/Footer.vue";

  export default {
    components:{
      Nav,Footer
    },
    data() {
      return {
        items: [
          { 운동: '체스트 프레스', 세트: 1, 횟수: 12},
          { 운동: '바벨 인클라인 벤치 프레스', 세트: 1, 횟수: 12},
          { 운동: '체스트 플라이', 세트: 1, 횟수: 12},
          { 운동: '케이블 트라이셉스 푸쉬다운', 세트: 1, 횟수: 12},
          { 운동: '덤벨 원암익스텐션', 세트: 1, 횟수: 12},
          { 운동: '크런치', 세트: 1, 횟수: 12}
        ]
      }
    }
  }
</script>