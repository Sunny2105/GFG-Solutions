<h2><a href="https://www.geeksforgeeks.org/problems/cricket-average2031/1">Cricket Average</a></h2><h3>Difficulty Level : Difficulty: Basic</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p dir="ltr"><span style="font-size: 14pt;">Given two arrays of same size <strong>a[] </strong>and <strong>b[]</strong>, representing the runs scored by a player and their status ("out" or "notout") in each of the matches, find the player's batting average.</span></p>
<p><span style="font-size: 14pt;">The average is defined as the total runs scored divided by the number of times the player got out, rounded up to the nearest integer (ceil value). If the player never got out across all matches, return -1.</span></p>
<p><strong><span style="font-size: 14pt;">Examples:</span></strong></p>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> a[] = [10, 101, 49], b[] = ["out", "notout", "out"]
<strong>Output:</strong> 80
<strong>Explanation:</strong> Total run = 10 + 101 + 49 = 160. The player gets out 2 times. So, average = 160 / 2 = 80.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> a[] = [15, 42, 20], b[] = ["out", "out", "notout"]
<strong>Output:</strong> 39
<strong>Explanation:</strong> Total run = 15 + 42 + 20 = 77. The player gets out 2 times. So, average = 77 / 2 = 38.5, which rounds up to 39.</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong></span><br><span style="font-size: 14pt;">1 ≤ a.size() = b.size() ≤ 500</span><br><span style="font-size: 14pt;">1 ≤ a[i] ≤ 300<br>b[i] = "out" or b[i] = "notout"</span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Mathematics</code>&nbsp;