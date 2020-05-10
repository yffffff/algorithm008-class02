学习笔记
递归的要点
1、不要人肉进行递归
2、找到最近最简方法，将其拆解成可重复解决的问题
3、数学归纳法思维

代码模板如下-需要熟背
Python 代码模板
自动检测
def recursion(level, param1, param2, ...): 
    # recursion terminator 
    if level > MAX_LEVEL: 
	   process_result 
	   return 
    # process logic in current level 
    process(level, data...) 
    # drill down 
    self.recursion(level + 1, p1, ...) 
    # reverse the current level status if needed


Java 代码模板
自动检测
public void recur(int level, int param) { 
  // terminator 
  if (level > MAX_LEVEL) { 
    // process result 
    return; 
  }
  // process current logic 
  process(level, param); 
  // drill down 
  recur( level: level + 1, newParam); 
  // restore current status 
 
}

分治、 回溯
本质上就是递归。
回溯法采用试错的思想，它尝试分步的去解决一个问题。在分步解决问题的过程
中，当它通过尝试发现现有的分步答案不能得到有效的正确的解答的时候，它将
取消上一步甚至是上几步的计算，再通过其它的可能的分步解答再次尝试寻找问
题的答案。
回溯法通常用最简单的递归方法来实现，在反复重复上述的步骤后可能出现两种
情况：
• 找到一个可能存在的正确的答案；
• 在尝试了所有可能的分步方法后宣告该问题没有答案。
在最坏的情况下，回溯法会导致一次复杂度为指数时间的计算。

分治模板
def divide_conquer(problem, param1, param2, ...): 
  # recursion terminator 
  if problem is None: 
	print_result 
	return 

  # prepare data 
  data = prepare_data(problem) 
  subproblems = split_problem(problem, data) 

  # conquer subproblems 
  subresult1 = self.divide_conquer(subproblems[0], p1, ...) 
  subresult2 = self.divide_conquer(subproblems[1], p1, ...) 
  subresult3 = self.divide_conquer(subproblems[2], p1, ...) 
  …

  # process and generate the final result 
  result = process_result(subresult1, subresult2, subresult3, …)
	
  # revert the current level states