# leetCode
记录leetcode答题

## Array
|  #  |      Title     |   Solutions   |  笔记                 
|-----|----------------|---------------|-------------
|p1|两数之和|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p1.java)|使用HashMap来寻找目标值
|p4|两数之和|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p4.java)|同时遍历两个数组，直到到了一个数组的末尾再把第二个数组剩余数加进去，最后求新生成的数组的中位数
|p35|搜索插入位置|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p35.java)|只要"target<=nums[result]",返回result
|p535|长url转短url|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p535.java)|使用HashMap储存长url，当数据量大时使用Mysql自增字段储存
|p561|数组拆分|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p561.java)|Array
|p771|找宝石|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p771.java)|Array
|p807|城市天际线|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p807.java)|Array



## String
|  #  |      Title     |   Solutions   |  笔记                 
|-----|----------------|---------------|-------------
|p3|无重复字符的最长字串|[Solution](https://github.com/szuming/leetCode/blob/master/src/String/p3.java)|两个循环，第二个循环应判断长度是否已经不可能超过result来优化
|p125|判断回文串|[Solution](https://github.com/szuming/leetCode/blob/master/src/String/p125.java)|用两个index分别从字符串首尾出发判断，每一次要找到英文或数字
|p344|字符串反转|[Solution](https://github.com/szuming/leetCode/blob/master/src/String/p344.java)|使用StringBuilder的reverse方法或是将String转为char[]操作
|p657|判断是否返回原地|[Solution](https://github.com/szuming/leetCode/blob/master/src/String/p657.java)|统计字符个数，然后比较，使用switch更为高效



## LinkedList
|  #  |      Title     |   Solutions   |  笔记                 
|-----|----------------|---------------|-------------
|p2|两数相加|[Solution](https://github.com/szuming/leetCode/blob/master/src/LinkedList/p2.java)|同时遍历两个链表直到一条链表结束，然后再把长的那条链表剩余的位加入，最后遍历结果链表处理进位

## sort
|  #  |      Title     |   Solutions   |  笔记                 
|-----|----------------|---------------|-------------
|p349|求交集|[Solution](https://github.com/szuming/leetCode/blob/master/src/sort/p349.java)|使用hashset保存不可重复值，遍历求得交集

## Backtracking
|  #  |      Title     |   Solutions   |  笔记                 
|-----|----------------|---------------|-------------
|p39|组合总和|[Solution](https://github.com/szuming/leetCode/blob/master/src/Backtracking/p39.java)|使用回溯法求解，当sum>target时剪枝，对于每个元素遍历自身与整个数组
|p52|n皇后问题|[Solution](https://github.com/szuming/leetCode/blob/master/src/Backtracking/p52.java)|当前点不符合则返回上一层的遍历状态
|p78|求幂集|[Solution](https://github.com/szuming/leetCode/blob/master/src/Backtracking/p78.java)|回溯法
|p413|求等差数列个数|[Solution](https://github.com/szuming/leetCode/blob/master/src/Backtracking/p413.java)|与全部遍历不同，要求的是连续的序列是否组成等差数组，因此只要遇到错误解就要立刻返回



## DynamicProgramming
|  #  |      Title     |   Solutions   |  笔记                 
|-----|----------------|---------------|-------------
|p64|最小路径和|[Solution](https://github.com/szuming/leetCode/blob/master/src/DynamicProgramming/p64.java)|使用二维数组记录相同的遍历结果




## tree
|  #  |      Title     |   Solutions   |  笔记                 
|-----|----------------|---------------|-------------
|p106|从中序与后序遍历序列构造二叉树|[Solution](https://github.com/szuming/leetCode/blob/master/src/tree/p106.java)|后序遍历的倒序是每棵子树的根节点,不断递归构造左子树与右子树
|p145|二叉树递归与非递归遍历|[Solution](https://github.com/szuming/leetCode/blob/master/src/tree/p145.java)|非递归时使用stack来储存遍历次序，使用HashMap来储存是否已经遍历
|p654|最大二叉树|[Solution](https://github.com/szuming/leetCode/blob/master/src/tree/p654.java)|不断递归构造左子树与右子树



## HashTable
|  #  |      Title     |   Solutions   |  笔记                 
|-----|----------------|---------------|-------------
|p811|域名访问次数|[Solution](https://github.com/szuming/leetCode/blob/master/src/HashTable/p811.java)|使用keyset遍历HashMap，spilt,charAt,subString

## HashTable
|  #  |      Title     |   Solutions   |  笔记                 
|-----|----------------|---------------|-------------
|p595|大国家|[Solution](https://github.com/szuming/leetCode/blob/master/src/SQL/p595.sql)|使用||或者or或者union来实现或操作
