<script>
export default {
  name: 'ListView'
}
</script>

<template>
<div class="container mt-3">
  <h1 class="display-1 text-center">사용자 목록</h1>
  <div class="btn-group">
    <a href="/user/save" class="btn btn-primary">사용자 추가</a>
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
    <tr class="cursor-pointer" onclick="location.href = '/user/findById'">
      <td>스티브</td>
      <td>jobs@shellfoder.com</td>
      <td>2023-02-28</td>
    </tr>
    <tr class="cursor-pointer" onclick="location.href = '/user/findById'">
      <td>에이브릴</td>
      <td>lavigne@shellfoder.com</td>
      <td>2023-02-27</td>
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

<style scoped>

</style>