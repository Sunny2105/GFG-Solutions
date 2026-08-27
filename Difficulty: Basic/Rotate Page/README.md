<h2><a href="https://www.geeksforgeeks.org/problems/rotate-page0923/1">Rotate Page</a></h2><h3>Difficulty Level : Difficulty: Basic</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 18px;">Given three points A<strong>(a1, a2)</strong>, B<strong>(b1, b2)</strong>, and <strong>C(c1, c2) </strong>on a page, find if the page can be rotated by some angle in either direction such that the new position of a becomes the old position of b, and the new position of b becomes the old position of c.</span></p>
<p><span style="font-size: 18px;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input</strong>: a1 = 1, a2 = 1, b1 = 1, b2 = 1, c1 = 1, c2 = 0
<strong>Output:</strong> false
<strong>Explanation</strong>: The distance between A and B is 0, while the distance between B and C is 1. Hence, no rotation is possible.</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>a1 = 0, a2 = 1, b1 = 1, b2 = 1, c1 = 1, c2 = 0
<strong>Output: </strong>true
<strong>Explanation</strong>: The distances AB and BC are equal, so AB can be rotated by 90 degrees to coincide with BC.
</span></pre></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Mathematics</code>&nbsp;