<template>
<div>
  <Nav></Nav>
  <form action="/ChallengesChoice">
    <p class="h4 text-center mb-4">챌린지 만들기</p>
    <label for="defaultFormRegisterNameEx" class="grey-text">챌린지 이름</label>
    <input type="text" v-model="challengeName" class="form-control"/>
    <br/>
    <label for="defaultFormRegisterEmailEx" class="grey-text">해당 운동1</label>
    <input type="text"  v-model="routineName1" class="form-control"/>
    <br/>
    <label for="defaultFormRegisterEmailEx" class="grey-text">해당 운동2</label>
    <input type="text"  v-model="routineName2" class="form-control"/>
    <br/>
    <label for="defaultFormRegisterEmailEx" class="grey-text">해당 운동3</label>
    <input type="text"  v-model="routineName3" class="form-control"/>
    <br/>
    <label for="defaultFormRegisterEmailEx" class="grey-text">해당 운동4</label>
    <input type="text"  v-model="routineName4" class="form-control"/>
    <br/>
    <label for="defaultFormRegisterEmailEx" class="grey-text">해당 운동5</label>
    <input type="text"  v-model="routineName5" class="form-control"/>
    <br/>
    <div class="text-center mt-4">
      <button class="btn btn-unique" @click="makeBtn">등록</button>
    </div>
  </form>
<Footer></Footer>
</div>
</template>

<script>
import Nav from "@/components/common/Nav.vue";
import Footer from "@/components/common/Footer.vue";
import axios from 'axios'

  export default {
    components:{
      Nav, Footer
    },
    data() {
      return {
        context : 'http://localhost:9000/challenges',
        challengeName: this.challengeName,
        routineName1: this.routineName1,
        routineName2: this.routineName2,
        routineName3: this.routineName3,
        routineName4: this.routineName4,
        routineName5: this.routineName5,
        setNumber: this.setNumber,
        countNumber: this.countNumber
      }
    },
    methods:{
      makeBtn(){
        let data = {
          challengeName: this.challengeName,
          routineName1: this.routineName1,
          routineName2: this.routineName2,
          routineName3: this.routineName3,
          routineName4: this.routineName4,
          routineName5: this.routineName5,
          setNumber: this.setNumber,
          countNumber: this.countNumber
        }
        let headers={
          'Content-type' : 'application/json',
          'Authorization' : 'JWT fefege...'
        }
        axios.post(`${this.context}`,
                    JSON.stringify(data),
                    {headers: headers})
              .then(res=>{
                alert('작성 성공')
              })
              .catch(e=>{
                alert('ERROR')
                this.$router.link(-1)
              })
      }
    }
  }
</script>