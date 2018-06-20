<template>
  <div>
    <ul v-for="item in todos"><li>{{item.todo}}</li></ul>
  </div>
</template>

<script>
import eventBus from "./EventBus.vue"

export default {
  name : "contents-component",
  created : function() {
    eventBus.$on("add", this.addTodo);
  },
  data : function() {
      return {todos : [
        {todo:"study vue", done:false},
        {todo:"study ionic", done:false},
        {todo:"study jquery", done:true}
      ]};
  },
  methods : {
    addTodo : function(todo) {
      this.todos.push({todo : todo, done : false});
    }
  }
}
</script>

<style>
li {
  list-style : none;
  margin : 0px;
  padding : 0px;
  text-align : center;
}
</style>