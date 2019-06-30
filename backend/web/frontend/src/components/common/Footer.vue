<template>
<div id="footer">
  <!-- Footer -->
  <mdb-footer color="black" class="font-small pt-4 mt-4">
    <mdb-container class="text-left">
      <mdb-row>
        <mdb-col sm="6">
          <h5 class="title">소개</h5><p></p>
          <p>내 마음대로 운동을 설정하는<p>운동 커스터마이징 사이트</p>
        </mdb-col>
        <mdb-col sm="6">
          <h5 class="title">연락</h5>
          <ul>
            <li class="list-unstyled"><a href="#!">블로그</a></li>
            <li class="list-unstyled"><a href="#!">https://thankstory.tistory.com/</a></li>
            <li class="list-unstyled"><a href="#!">Github 주소</a></li>
            <li class="list-unstyled"><a href="#!">https://github.com/yong1227/bit190628-spring-boot-jpa-vue-separation</a></li>
          </ul>
        </mdb-col>
      </mdb-row>
    </mdb-container>
    <div class="footer-copyright text-center py-3">
      <mdb-container fluid>
        &copy; 2019 Copyright: <a href="https://www.URCoach.com"> URCoach.com </a>
      </mdb-container>
    </div>
  </mdb-footer>
  <!-- Footer -->
</div>
</template>

<script>
import { mdbFooter, mdbContainer, mdbRow, mdbCol } from 'mdbvue';

export default {
    name: 'FooterPage',
    components: {
      mdbFooter,
      mdbContainer,
      mdbRow,
      mdbCol
    }
  }
</script>

<style>
#footer{
  padding-top: 5rem
}
</style>
