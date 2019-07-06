<template>
  <div id="nav">
    <b-navbar toggleable="lg" type="dark" id="navbar">
      <b-navbar-brand to="/"><img src="../../assets/training.png" alt="training" width="25" height="25"> URCoach</b-navbar-brand>
      <b-navbar-brand to="/ChallengesChoice">챌린지</b-navbar-brand>

      <b-navbar-toggle target="nav-collapse"></b-navbar-toggle>

      <b-collapse id="nav-collapse" is-nav>
        <b-navbar-nav id="menu">
          <b-nav-item to="/ChallengesInput">만들기</b-nav-item>
          <b-nav-item to="/ChallengesChoice">선택</b-nav-item>
          <b-nav-item to="/Exercies">운동 디테일</b-nav-item>
        </b-navbar-nav>
      </b-collapse>
    </b-navbar>
  </div>
</template>

<script>
export default {

};
</script>

<style>
#nav{
  padding-bottom: 5rem
}

#navbar {
  background-color:black;
}
</style>
