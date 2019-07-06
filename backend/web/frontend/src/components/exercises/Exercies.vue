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
         
        ]
      }
    }
  }
</script>