学习笔记
遍历搜索
• 每个节点都要访问一次
• 每个节点仅仅要访问一次
• 对于节点的访问顺序不限
- 深度优先：depth first search
- 广度优先：breadth first search

深度优先搜索
左-中-右
递归写法如下
visited = set()
def dfs(node, visited):
if node in visited: # terminator
# already visited
return
visited.add(node)
# process current node here.
...
for next_node in node.children():
if not next_node in visited:
dfs(next_node, visited)

DFS 代码 - 非递归写法如下
def DFS(self, tree):
	if tree.root is None:
		return []
	visited, stack = [], [tree.root]
	while stack:
		node = stack.pop()
		visited.add(node)
		process (node)
		nodes = generate_related_nodes(node)
	stack.push(nodes)
	# other processing work
	...

bfs广度优先搜索
visited = set()
def BFS(graph, start, end):
	queue = []
	queue.append([start])
	visited.add(start)
	while queue:
		node = queue.pop()
		visited.add(node)
		process(node)
		nodes = generate_related_nodes(node)
		queue.push(nodes)
		

贪心算法
贪心法可以解决一些最优化问题，如：求图中的最小生成树、求哈夫曼编码
等。然而对于工程和生活中的问题，贪心法一般不能得到我们所要求的答案。
一旦一个问题可以通过贪心法来解决，那么贪心法一般是解决这个问题的最
好办法。由于贪心法的高效性以及其所求得的答案比较接近最优结果，贪心
法也可以用作辅助算法或者直接解决一些要求结果不特别精确的问题。

适用贪心算法的场景
简单地说，问题能够分解成子问题来解决，子问题的最优解能递推到最终
问题的最优解。这种子问题最优解称为最优子结构。

贪心算法与动态规划的不同在于它对每个子问题的解决方案都做出选择，
不能回退。动态规划则会保存以前的运算结果，并根据以前的结果对当前
进行选择，有回退功能。


二分查找
前提：
1. 目标函数单调性（单调递增或者递减）
2. 存在上下界（bounded）
3. 能够通过索引访问（index accessible)
代码模板如下
left, right = 0, len(array) - 1
while left <= right:
	mid = (left + right) / 2
	if array[mid] == target:
		# find the target!!
		break or return result
	elif array[mid] < target:
		left = mid + 1
	else:
		right = mid - 1
		
		
		