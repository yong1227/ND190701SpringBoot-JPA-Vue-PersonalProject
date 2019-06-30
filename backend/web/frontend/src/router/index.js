import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/Home'
import Main from '@/components/customizing/Main'
import Challenges from '@/components/customizing/Challenges'
import atHome from '@/components/exercises/atHome'
import threePart from '@/components/exercises/threePart'

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    { path: '/', name: 'Home', component: Home },
    { path: '/Main', name: 'Main', component: Main },
    { path: '/Challenges', name: 'Challenges', component: Challenges },
    { path: '/atHome', name: 'atHome', component: atHome },
    { path: '/threePart', name: 'threePart', component: threePart }
  ]
})
