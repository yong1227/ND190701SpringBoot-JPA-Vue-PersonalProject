import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/Home'
import ChallengesInput from '@/components/customizing/ChallengesInput'
import ChallengesChoice from '@/components/customizing/ChallengesChoice'
import Exercies from '@/components/exercises/Exercies'

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    { path: '/', name: 'Home', component: Home },
    { path: '/ChallengesChoice', name: 'ChallengesChoice', component: ChallengesChoice },
    { path: '/Exercies', name: 'Exercies', component: Exercies },
    { path: '/ChallengesInput', name: 'ChallengesInput', component: ChallengesInput }
  ]
})
