# leetCode
记录leetcode答题

## Array
|  #  |      Title     |   Solutions   |  笔记                 
|-----|----------------|---------------|-------------
|p1|两数之和|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p1.java)|使用HashMap来寻找目标值
|p4|两数之和|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p4.java)|同时遍历两个数组，直到到了一个数组的末尾再把第二个数组剩余数加进去，最后求新生成的数组的中位数
|p7|反转整数|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p7.java)|将result设为long型，当res>Integer.MAX_VALUE时溢出
|p9|检查是否是回文数|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p9.java)|反转整数后再比较是否相等即可
|p11|盛水最多的容器|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p11.java)|双指针，较小的那个往中间移动
|p13|罗马数字|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p13.java)|与前一个数相比，大于前一个数则减去，少于则加上
|p14|最长公共前缀|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p14.java)|一个个字符比较即可
|p15|三数之和|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p15.java)|双指针，先快排形成有序，遍历一次选定第一个数，然后头尾指针遍历第一数右边的数，三数结果<0则头指针往右移，>0则往左移，避免重复需保证相邻的两个数不相等
|p16|最接近的三数之和|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p16.java)|双指针，先快排形成有序，遍历一次选定第一个数，然后头尾指针遍历第一数右边的数，三数结果<目标则头指针往右移，>目标则往左移
|p18|四数之和|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p18.java)|与三数之和相似，只是多了一层循环
|p26|删除重复元素|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p26.java)|快慢指针遍历，遇到不同时更新
|p27|删除指定元素|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p27.java)|快慢指针遍历，当快指针所指值不等于指定值时更新数组
|p31|下一个排列|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p31.java)|从后往前遍历，将大的值往后移，只要不是移到最后的位置，那么就将在它之后比它大的那个数两两交换放到最前面,得到结果
|p33|搜索旋转排序数组|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p33.java)|如果大于头元素则从头位置开始往后搜索，否则从尾元素开始往前搜索
|p34|搜索范围|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p34.java)|头尾指针遍历，当结果数组的值都不为-1时得到结果
|p35|搜索插入位置|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p35.java)|只要"target<=nums[result]",返回result
|p48|原地旋转图像|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p48.java)|先将二维护士组行与列位置交换再将每一行旋转
|p53|最大连续序列和|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p53.java)|当连续序列和小于0时要将其更新为0
|p54|螺旋矩阵|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p54.java)|一圈一圈遍历即可，从外到内
|p55|跳跃游戏|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p55.java)|用一个变量存储剩余步数，当遍历到的位置的数大于剩余步数时，更新剩余步数
|p56|重叠区间|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p56.java)|循环遍历求每次的最小值，然后比较end值来确定是否重叠
|p59|螺旋矩阵2|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p59.java)|一圈一圈遍历即可，从外到内
|p66|加1|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p66.java)|注意进位，用变量存储进位，然后处理进位的情况
|p73|矩阵置0|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p73.java)|常量空间复杂度，先遍历第一行第一列但是不置0最后才置0，然后从第二行第二列开始判断将需要置0的行列用第一行第一列来记录，然后遍历第一行第一列将整个二维矩阵置0，最后置0第一行第一列
|p74|搜索二维矩阵|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p74.java)|先对每一行进行2分搜索来找到target所在行，然后再对该行进行二分搜索找到target
|p75|颜色分类|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p75.java)|因为只有三个数012，所以使用双指针lt,gt指向0与1的位置，然后用i去遍历
|p535|长url转短url|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p535.java)|使用HashMap储存长url，当数据量大时使用Mysql自增字段储存
|p561|数组拆分|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p561.java)|Array
|p771|找宝石|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p771.java)|Array
|p807|城市天际线|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p807.java)|Array
|p832|翻转图像|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p832.java)|反转与遍历矩阵


## String
|  #  |      Title     |   Solutions   |  笔记                 
|-----|----------------|---------------|-------------
|p3|无重复字符的最长字串|[Solution](https://github.com/szuming/leetCode/blob/master/src/String/p3.java)|两个循环，第二个循环应判断长度是否已经不可能超过result来优化
|p5|最长回文串|[Solution](https://github.com/szuming/leetCode/blob/master/src/String/p5.java)|使用回溯法求解
|p6|Z型字符串|[Solution](https://github.com/szuming/leetCode/blob/master/src/String/p6.java)|只要修改了索引就要考虑有没有数组越界的可能
|p8|实现atoi|[Solution](https://github.com/szuming/leetCode/blob/master/src/String/p8.java)|设立标记位记录数字开始，溢出在每次result*10之后都要去判断
|p657|判断是否返回原地|[Solution](https://github.com/szuming/leetCode/blob/master/src/String/p657.java)|统计字符个数，然后比较，使用switch更为高效
|p125|判断回文串|[Solution](https://github.com/szuming/leetCode/blob/master/src/String/p125.java)|用两个index分别从字符串首尾出发判断，每一次要找到英文或数字
|p344|字符串反转|[Solution](https://github.com/szuming/leetCode/blob/master/src/String/p344.java)|使用StringBuilder的reverse方法或是将String转为char[]操作
|p345|反转元音字母|[Solution](https://github.com/szuming/leetCode/blob/master/src/String/p345.java)|使用一个数组来储存元音字母，设其值为1；然后分别从头与从尾开始遍历交换元音字母
|p657|判断是否返回原地|[Solution](https://github.com/szuming/leetCode/blob/master/src/String/p657.java)|统计字符个数，然后比较，使用switch更为高效


## LinkedList
|  #  |      Title     |   Solutions   |  笔记                 
|-----|----------------|---------------|-------------
|p2|两数相加|[Solution](https://github.com/szuming/leetCode/blob/master/src/LinkedList/p2.java)|同时遍历两个链表直到一条链表结束，然后再把长的那条链表剩余的位加入，最后遍历结果链表处理进位
|p83|删除链表重复元素|[Solution](https://github.com/szuming/leetCode/blob/master/src/LinkedList/p83.java)|两个节点分别代表前后节点，判断前后节点值然后决定是否转移


## sort
|  #  |      Title     |   Solutions   |  笔记                 
|-----|----------------|---------------|-------------
|p349|求交集|[Solution](https://github.com/szuming/leetCode/blob/master/src/sort/p349.java)|使用hashset保存不可重复值，遍历求得交集


## Backtracking
|  #  |      Title     |   Solutions   |  笔记                 
|-----|----------------|---------------|-------------
|p39|组合总和|[Solution](https://github.com/szuming/leetCode/blob/master/src/Backtracking/p39.java)|使用回溯法求解，当sum>target时剪枝，对于每个元素遍历自身与整个数组
|p40|组合总和2|[Solution](https://github.com/szuming/leetCode/blob/master/src/Backtracking/p40.java)|先排序然后在从头开始遍历回溯，只要当前点的和大于target则可以跳出当层循环，为了避免重复，相同的元素执行跳过
|p52|n皇后问题|[Solution](https://github.com/szuming/leetCode/blob/master/src/Backtracking/p52.java)|当前点不符合则返回上一层的遍历状态
|p78|求幂集|[Solution](https://github.com/szuming/leetCode/blob/master/src/Backtracking/p78.java)|回溯法
|p79|单词搜索|[Solution](https://github.com/szuming/leetCode/blob/master/src/Backtracking/p78.java)|在进入一个点时将其标记为已使用，若最后该点不能构成单词则重置为0，搜索单词使用回溯法向四个方向搜索即可
|p413|求等差数列个数|[Solution](https://github.com/szuming/leetCode/blob/master/src/Backtracking/p413.java)|与全部遍历不同，要求的是连续的序列是否组成等差数组，因此只要遇到错误解就要立刻返回


## DynamicProgramming
|  #  |      Title     |   Solutions   |  笔记                 
|-----|----------------|---------------|-------------
|p62|路径数|[Solution](https://github.com/szuming/leetCode/blob/master/src/DynamicProgramming/p62.java)|到当前点的路径数+往右到达终点的路径数+往下到达终点的路径数
|p64|最小路径和|[Solution](https://github.com/szuming/leetCode/blob/master/src/DynamicProgramming/p64.java)|使用二维数组记录相同的遍历结果
|p70|上楼梯|[Solution](https://github.com/szuming/leetCode/blob/master/src/DynamicProgramming/p70.java)|使用ways[]来记录每一个楼梯到达楼顶的方法个数，ways[i]=ways[i+1]+ways[i+2]
|p121|买卖股票的最佳时机1|[Solution](https://github.com/szuming/leetCode/blob/master/src/DynamicProgramming/p121.java)|每次读一个就更新最小价格，然后比较利润
|p122|买卖股票的最佳时机2|[Solution](https://github.com/szuming/leetCode/blob/master/src/DynamicProgramming/p122.java)每遍历一个就看能不卖出利润，并更新最低价格
|p123|买卖股票的最佳时机3|[Solution](https://github.com/szuming/leetCode/blob/master/src/DynamicProgramming/p123.java)第一次卖股票之后要求第二次卖股票的最大利润，使用一个int[]记录第一次卖股票的点的第二次卖股票最大值，避免重复计算
|p70|上楼梯|[Solution](https://github.com/szuming/leetCode/blob/master/src/DynamicProgramming/p70.java)|使用ways[]来记录每一个楼梯到达楼顶的方法个数，ways[i]=ways[i+1]+ways[i+2]
|p139|单词拆分|[Solution](https://github.com/szuming/leetCode/blob/master/src/DynamicProgramming/p139.java)|使用flag记录从第index位置开始是否能到达终点，不能设为1则下次遍历直接返回false
|p650|只有两个键的键盘|[Solution](https://github.com/szuming/leetCode/blob/master/src/DynamicProgramming/p650.java)|每次递归需要判断是否可以执行复制，剩余长度%复制后的长度==0则可进行复制


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
