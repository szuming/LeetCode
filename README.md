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
|p12|整数转罗马数字|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p12.java)|用两个数组分别对应罗马数字与阿拉伯数字，然后对整数每一位从数组中找到对应的罗马数字拼接即可
|p13|罗马数字转整数|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p13.java)|与前一个数相比，大于前一个数则减去，少于则加上
|p15|三数之和|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p15.java)|双指针，先快排形成有序，遍历一次选定第一个数，然后头尾指针遍历第一数右边的数，三数结果<0则头指针往右移，>0则往左移，避免重复需保证相邻的两个数不相等
|p17|电话号码的字母组合|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p19.java)|用一个二维数组作为字典代表每个数字对应的字母数组，然后根据输入的字符串去查询拼接即可
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


## string
|  #  |      Title     |   Solutions   |  笔记                 
|-----|----------------|---------------|-------------
|p3|无重复字符的最长字串|[Solution](https://github.com/szuming/leetCode/blob/master/src/String/p3.java)|两个循环，第二个循环应判断长度是否已经不可能超过result来优化
|p5|最长回文串|[Solution](https://github.com/szuming/leetCode/blob/master/src/String/p5.java)|使用回溯法求解
|p6|Z型字符串|[Solution](https://github.com/szuming/leetCode/blob/master/src/String/p6.java)|只要修改了索引就要考虑有没有数组越界的可能
|p8|实现atoi|[Solution](https://github.com/szuming/leetCode/blob/master/src/String/p8.java)|设立标记位记录数字开始，溢出在每次result*10之后都要去判断
|p14|最长公共前缀|[Solution](https://github.com/szuming/leetCode/blob/master/src/String/p14.java)|一个个字符比较即可
|p28|实现strStr()|[Solution](https://github.com/szuming/leetCode/blob/master/src/String/p28.java)|两层循环遍历
|p38|报数|[Solution](https://github.com/szuming/leetCode/blob/master/src/String/p38.java)|每次循环得到的结果作为下一次循环的输入
|p38|最后一个字符串长度|[Solution](https://github.com/szuming/leetCode/blob/master/src/String/p58.java)|先从后往前找到第一个非空格字符，然后从该位置在往前找找到第一个非空格字符，相减即为最后一个字符串长度
|p657|判断是否返回原地|[Solution](https://github.com/szuming/leetCode/blob/master/src/String/p657.java)|统计字符个数，然后比较，使用switch更为高效
|p125|判断回文串|[Solution](https://github.com/szuming/leetCode/blob/master/src/String/p125.java)|用两个index分别从字符串首尾出发判断，每一次要找到英文或数字
|p344|字符串反转|[Solution](https://github.com/szuming/leetCode/blob/master/src/String/p344.java)|使用StringBuilder的reverse方法或是将String转为char[]操作
|p345|反转元音字母|[Solution](https://github.com/szuming/leetCode/blob/master/src/String/p345.java)|使用一个数组来储存元音字母，设其值为1；然后分别从头与从尾开始遍历交换元音字母
|p657|判断是否返回原地|[Solution](https://github.com/szuming/leetCode/blob/master/src/String/p657.java)|统计字符个数，然后比较，使用switch更为高效


## LinkedList
|  #  |      Title     |   Solutions   |  笔记                 
|-----|----------------|---------------|-------------
|p2|两数相加|[Solution](https://github.com/szuming/leetCode/blob/master/src/LinkedList/p2.java)|同时遍历两个链表直到一条链表结束，然后再把长的那条链表剩余的位加入，最后遍历结果链表处理进位
|p19|删除链表倒数位置|[Solution](https://github.com/szuming/leetCode/blob/master/src/LinkedList/p19.java)|一次遍历，两个指针相差为n,然后再往前遍历，则前指针为要删除的节点
|p21|合并有序链表|[Solution](https://github.com/szuming/leetCode/blob/master/src/LinkedList/p21.java)|一次遍历，每次比较两节点大小将小节点写入结果链表，直到其中有一条遍历完，将另外一条接上即可
|p24|两两交换|[Solution](https://github.com/szuming/leetCode/blob/master/src/LinkedList/p24.java)|注意判断非空条件应该是pre.next!=null&&pre.next.next!=null
|p83|删除链表重复元素|[Solution](https://github.com/szuming/leetCode/blob/master/src/LinkedList/p83.java)|两个节点分别代表前后节点，判断前后节点值然后决定是否转移


## sort
|  #  |      Title     |   Solutions   |  笔记                 
|-----|----------------|---------------|-------------
|p349|求交集|[Solution](https://github.com/szuming/leetCode/blob/master/src/sort/p349.java)|使用hashset保存不可重复值，遍历求得交集


## Backtracking
|  #  |      Title     |   Solutions   |  笔记                 
|-----|----------------|---------------|-------------
|p22|括号生成|[Solution](https://github.com/szuming/leetCode/blob/master/src/Backtracking/p22.java)|count统计(个数，consume统计还可匹配（的个数,先执行放(,后执行放)
|p39|组合总和|[Solution](https://github.com/szuming/leetCode/blob/master/src/Backtracking/p39.java)|当sum>target时剪枝，对于每个元素遍历自身与整个数组
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
|p36|有效的数独|[Solution](https://github.com/szuming/leetCode/blob/master/src/HashTable/p36.java)|使用2个二维数组来记录行与列各数字出现次数，用三维数组来记录小9宫格各数字出现次数
|p811|域名访问次数|[Solution](https://github.com/szuming/leetCode/blob/master/src/HashTable/p811.java)|使用keyset遍历HashMap，spilt,charAt,subString


## SQL
|  #  |      Title     |   Solutions   |  笔记                 
|-----|----------------|---------------|-------------
|p595|大国家|[Solution](https://github.com/szuming/leetCode/blob/master/src/SQL/p595.sql)|使用||或者or或者union来实现或操作

## Stack
|  #  |      Title     |   Solutions   |  笔记                 
|-----|----------------|---------------|-------------
|p20|括号匹配|[Solution](https://github.com/szuming/leetCode/blob/master/src/SQL/p20.java)|使用LinkedList来实现栈，每当遇到"([{"入栈,遇到")]}"出栈匹配

## 剑指offer
|  #  |      Title     |   Solutions   |  笔记                 
|-----|----------------|---------------|-------------
|P3|二维数组中的查找|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P3.java)|从右上角往左下角收缩，每次遍历可缩小一行或一列
|P4|替换空格|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P4.java)|可以考虑用新的StringBuffer来作为结果储存结构，原空间的话就先遍历统计空格数再扩大长度
|P5|从尾到头打印链表|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P5.java)|递归遍历链表即可，在调用方法后才将当前节点值加入到result
|P6|前序与中序遍历构造树|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P6.java)|遍历前序数组，每一个都对可以从中序里找出左右子树，递归即可
|P7|两个栈构造队列|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P7.java)|stack1作为push的栈，stack2作为pop栈，实现push直接push到stack1即可，pop就是stack2来pop，没数据要从stack1转移数据到stack2
|P8|旋转数组的最小数字|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P8.java)|二分法，要注意的是三个index相等时无法使用二分判断，智能从它们之间遍历获取最小
|P9|斐波那契数列|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P9.java)|递归法会导致重复计算，应该从0开始计算到目标数
|P10|二进制中1的个数|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P10.java)|让1与目标与运算，不断左移1，这样就可避免死循环，或者通过>>>无符号右移（左边直接补0）
|P11|数值的整数次方|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P11.java)|注意判断指数是否为负数
|P12|使奇数位于偶数前面|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P12.java)|双指针，先求出第一个偶数与第一个奇数，然后遍历数组每遇到一次奇数就放到奇数位置，然后奇数指针++
|P13|链表倒数第k个节点|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P13.java)|双指针，一个指针先行k次，另一个再一起遍历知道先行指针为null，注意的是k<=0,head = null等非法输入处理，还有遍历过程先行指针null检测
|P14|反转链表|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P14.java)|保存第三个node，注意head的next要在第一次倒转后设为null，如果长度小于2直接返回head
|P15|合并链表|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P15.java)|注意空链表输入，遍历完其中一条，再将另一条剩余的补上
|P16|判断是否是子树|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P16.java)|两层递归，第一层寻找第一个值相等的节点作为root，然后在来一层一一对比
|P17|求二叉树的镜像|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P17.java)|前序遍历，只要当前节点不为null，就对它的左右子树求镜像，然后再交换左右子树
|p18|螺旋矩阵|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P17.java)|一圈一圈遍历即可，从外到内
|p19|栈的最小元素|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P19.java)|用一个辅助栈与一个最小值min变量，辅助栈每次存的都是栈里最小值，当栈pop时，辅助栈也跟着pop
|p20|栈的压进与弹出序列|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P20.java)|用一个辅助栈，遍历弹出序列，每个弹出序列值先比较当前栈顶是否为目标值，不是就往后遍历压进序列直到目标值
|p21|从上往下打印二叉树|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P21.java)|用一个辅助队列，先进先出，把当前节点的左右非空子节点放入队列即可
|p22|判断序列是否为二叉搜索树后序遍历|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P22.java)|序列最后一个为当前序列最小点，根据左子树小于当前点，右子树大于当前点，进行划分后递归判断
|p23|二叉树路径和|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P23.java)|一直递归遍历直到无左右子树，判断和是否等于目标值，每次递归结束都要删除本节点的值sum与list
|p24|复制复杂链表|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P24.java)|先复制直接跟在父节点后，然后再遍历一次设置random节点，然后分离父子链表
|p26|字符串字符排序|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P26.java)|递归遍历问题，可以看成前i-1位排序好，第i位与后面的交换，从0递归到len
|p27|统计出现次数超过一半的数字|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P27.java)|（1）先排序判断中位数的出现次数是否超过一般（2）用一个hashmap存储次数
|p28|topK问题|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P28.java)|可以改变数组则直接使用快排方式，不可以则使用堆排序，最大堆
|p29|连续子数组的最大值|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P29.java)|sum统计和，如果sum>max则设置max，如果和小于0则重置为0
|p31|把数组排成最小得数|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P31.java)|转换成String数组，然后通过定义comarator来排序，规则是组成mn比nm小则m在前n在后
|p32|丑数|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P32.java)|用数组记录丑数，三个指针分别指向2 3 5的下一个乘之后大于最大丑数的位置，然后每次计算这三个最小的那个作为新的丑数，同时比较更新三个指针
|p33|第一个只出现一次的字符|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P33.java)|遍历字符串时使用LinkedHashMap去记录出现次数
|p35|两链表第一个公共节点|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P35.java)|统计长度，算出差值d，让长的链表先走d，然后再同时遍历找到共同点；（2）第一个共同节点后的都是相同的，使用两个栈存储遍历结果，找到第一个不相同的节点，它的next就是第一个相同的节点
|p36|数字在排序数组中出现的次数|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P36.java)|二分查找找到第一次出现的位置和最后出现的位置，相减即可
|p37|二叉树深度|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P37.java)|每次递归深度+1，比较左右子数的深度，每个节点取较长的那个
|p38|判断是否是平衡二叉树|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P38.java)|后序遍历二叉树并记录深度，每次遍历都比较深度之差是否为1
|p39|数组中只出现过一次的数字|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P39.java)|只有一个只出现一次的数字时直接异或就得到了，两个的话先异或，得到的结果找到第一位不为0的位置，然后根据这个数来将数组分成两个数组，每个数组只包含一个只出现一次的数字，再分别异或得到的就是唯一的数字
|p40|排序数组求和为目标s的所有序列|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P40.java)|双指针，当和大于目标k时，将右指针往回走一步，左指针往前走一步，知道找到目标值；当找到一组序列后，右指针继续往前走即可
|p41|和为s的两个数字|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P41.java)|双指针，首尾往中间遍历，当相加结果大于目标k时，尾指针往前走一步，否则首指针往后走一步
|p42|左旋转字符串|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P42.java)|把字符串分为需要旋转部分与不需要旋转部分，先将整个字符串旋转，然后两部分分别旋转，最后再整个旋转
|p43|反转字符串单词|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P43.java)|先将整个字符串反转，然后将里面的单词反转
|p44|扑克牌顺子|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P44.java)|1.排序2.计算王的数量3.判断王的数量能不能补上缺口
|p46|求1+2+...+n|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P46.java)|使用&&短路特性来作为递归终结的判断
|p47|不用+-*/实现加法|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P47.java)|1.忽略进位得到相加结果，通过^实现2.计算进位,通过&之后<<1实现3.重复计算直到没有进位
|p48|字符串转整数|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P48.java)|注意处理第一位为'+'或'-'的情况
|p49|数组中重复的数字|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P49.java)|用一个boolean数组做标记即可
|p50|构建乘积数组|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P50.java)|用两个数组存放前面部分乘积与后面乘积，然后再将他它们相乘即可
|p52|表示数值的字符串|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P52.java)|注意处理e与E，+-，e后的整数
|p53|字符流中第一个不重复的字符|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P53.java)|使用数组记录，每个字符ASCII作为index，对应的值作为在字符流中的位置，当重复出现时更新为负数，寻找最小的不为负数的index
|p54|循环链表的入口|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P54.java)|快慢指针统计循环的长度k，然后让快指针先走k，然后再一起走直到相同即为第一个入口
|p55|删除链表中重复的节点|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P55.java)|为避免头节点就是重复的节点，先创建一个头节点来连接传入的节点，然后开始遍历删除，不是每次遍历都将p=p.next,只有没有删除节点时才需要
|p56|二叉树的下一个节点|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P56.java)|中序遍历，那么对于目标节点k如果右子树不空则右子树最左的节点就是返回值，若右子树为空，则往上遍历找到第一个是父节点的左子节点，然后它的父节点就是返回值
|p57|对称二叉树|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P57.java)|前序遍历与倒前序遍历，比较值是否相同，注意处理null
|p58|将二叉树打印成多行|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P58.java)|使用队列来存储，只要队列不空继续遍历；使用一个变量记录下一层的数目，用一个变量记录剩余的数目，当剩余为0时打印，更新剩余数为下一层数，下一层数置为0
|p59|之字形打印二叉树|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P59.java)|使用两个栈分别存奇数层与偶数层
|p60|序列化二叉树|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P60.java)|前序遍历即可，null使用#代替
|p61|二叉搜索树的第k小节点|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P61.java)|中序遍历即可
|p62|输入流中的中位数|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P62.java)|使用链表记录，然后查找中位数即可，需要排序
|p63|输入流中的中位数|[Solution](https://github.com/szuming/leetCode/blob/master/src/offer/P63.java)|用两个数组对应单位与个位，整数部分与小数部分分别处理再将结果合并








