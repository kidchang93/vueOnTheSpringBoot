import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path: '/user',
      name: 'ListView',
      component: () => import('../views/ListView.vue')
    },{
      path: '/user/findById/',
      name: 'SelectView',
      component: () => import('../views/SelectView.vue')
    },{
      path: '/user/editById',
      name: 'UpdateView',
      component: () => import('../views/UpdateView.vue')
    },{
      path: '/user/save',
      name: 'CreateView',
      component: () => import('../views/CreateView.vue')
    }
  ]
})

export default router
