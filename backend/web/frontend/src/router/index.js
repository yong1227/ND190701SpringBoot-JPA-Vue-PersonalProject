import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/Home'
import Main from '@/components/customizing/Main'
import Challenges from '@/components/customizing/Challenges'
import Exercies from '@/components/exercises/Exercies'

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    { path: '/', name: 'Home', component: Home },
    { path: '/Main', name: 'Main', component: Main },
    { path: '/Challenges', name: 'Challenges', component: Challenges },
    { path: '/Exercies', name: 'Exercies', component: Exercies }
  ]
})
