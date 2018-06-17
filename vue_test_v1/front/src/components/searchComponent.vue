<template>
  <input type='text' v-model='todo' @keyup.enter='addTodo()' />
</template>

<script>
import eventBus from './EventBus.vue'

export default {
  name : "search-component",
  data : function() {
    return { todo : ""};
  },
  methods : {
    addTodo : function() {
      if (this.todo.length > 0) {
        eventBus.$emit("add", this.todo);
      }
    }
  }
}

</script>

<style>
</style>