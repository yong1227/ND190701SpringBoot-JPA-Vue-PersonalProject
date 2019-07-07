<template>
<div>
  <Nav></Nav>
  <form align="center">
    <p class="h4 text-center mb-4" >루틴 수정</p>
    
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
      <button class="btn btn-unique" @click="updateBtn">수정 완료</button>
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
        id: '',
        list: []
      }
    },
    created() {
      this.id = this.$store.state.id;
      this.routineName1 = this.$store.state.routineName1;
      this.routineName2 = this.$store.state.routineName2;
      this.routineName3 = this.$store.state.routineName3;
      this.routineName4 = this.$store.state.routineName4;
      this.routineName5 = this.$store.state.routineName5;
    },
    methods: {
      updateBtn(e){
        e.preventDefault();
        
        let data= {
          routineName1: this.routineName1, 
          routineName2: this.routineName2,
          routineName3: this.routineName3,
          routineName4: this.routineName4,
          routineName5: this.routineName5
        }
        let headers= {
          'Content-type' : 'application/json',
          'Authorization' : 'JWT fefege...'
        }
        axios
          .put(`${this.context}/update/`+this.$store.state.id, JSON.stringify(data), {headers: headers})
          .then(res=>{
            alert('수정 완료')

            this.$store.state.list = this.list;

            this.$router.push('/Exercies')
          })
          .catch(e=>{
            alert('error')
            this.$router.link(-1)
          })
      }
    }
  }
</script>