<template>
  <div class="app-container">

    <tree-table v-loading="listLoading" :data="data" border
                fit
                highlight-current-row
                style="width: 100%;">
      <el-table-column label="名称">
        <template slot-scope="scope">
          <span style="color:sandybrown">{{ scope.row.name }}</span>
        </template>
      </el-table-column>
      <el-table-column label="说明">
        <template slot-scope="scope">
          <span style="color:sandybrown">{{ scope.row.describe }}</span>
        </template>
      </el-table-column>
    </tree-table>

  </div>
</template>

<script>
  import treeTable from '@/components/TreeTable'
  import {fetchList} from '@/api/dept'

  export default {
    name: 'dept',
    components: {treeTable},
    data() {
      return {
        tableKey: 0,
        listLoading: true,
        listQuery: {
          importance: undefined,
          title: undefined,
          type: undefined,
        },
        showReviewer: false,
        pvData: [],
        downloadLoading: false
      }
    },
    created() {
      this.getList()
    },
    methods: {
      getList() {
        this.listLoading = true
        fetchList().then(response => {
          this.data = response.data

          setTimeout(() => {this.listLoading = false},0.5 * 1000)
        })
      },
      showLoading () {
        this.showOverlay = true
      },
      hideLoading () {
        this.showOverlay = false
        this.$emit('update:reloadData', false)
      }
    }
  }
</script>
