<template>
    <div>
        <Nav></Nav>
        
    </div>
</template>

<script>
import Nav from '@/components/common/Nav.vue'

export default { 
    data() {
        return {
            context:'http://localhost:9000/'
        }
    },
    components:{
        Nav
    }
}
</script>

<style scoped>

</style>
