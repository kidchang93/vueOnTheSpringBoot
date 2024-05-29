

<template>
<div class="container mt-3">
  <h1 class="display-1 text-center">사용자 목록</h1>
  <div class="btn-group">
    <router-link to="/user/save" class="btn btn-primary">사용자 추가</router-link>
  </div>
  <table class="table table-hover mt-3">
    <thead class="table-dark">
    <tr>
      <th>이름</th>
      <th>이메일</th>
      <th>가입날짜</th>
    </tr>
    </thead>
    <tbody>
    <tr class="cursor-pointer" v-for="row in result" v-bind:key="row.no" v-on:click="href(row)">
      <td>{{row.name}}</td>
      <td>{{row.email}}</td>
      <td>{{row.regDate}}</td>
    </tr>

<!--<tr class="cursor-pointer" v-for="row in result" v-bind:key="row.no" v-on:click="href(row)">
      <td>{{ row.name }}</td>
      <td>{{ row.email }}</td>
      <td>{{ dateTime(row.regDate) }}</td>
    </tr>-->
    </tbody>
  </table>
</div>
</template>
<script>
import axios from 'axios'
import store from '@/store/index.js'

export default {
  name: 'ListView',
  data(){
    return{
      result: [
      ]
    }
  },
  created() {
    console.log(store)
    this.getData()
  },
  methods:{
    getData(){
      axios
        .post('http://localhost:8080/findAll')
        .then((response) => {
          console.log(response)
          this.result = response.data.result
        })
        .catch(error =>{
          console.log(error)
        })
    },
    href(row){

      // query -> 쿼리스트링에 키값으로 담아 보내진다.
      // params -> 쿼리스트링에 보내지지만 value 값만 보여진다.
      // index.js -> path : '/user/findById/:name/:id'
      this.$store.commit('setUser',row)
      this.$router.push({name: 'SelectView'})
    }
  }
}


</script>
<style scoped>

</style>