<h2> 69 4
3523. Make Array Non-decreasing</h2><hr><div><p>You are given an integer array <code>nums</code>. In one operation, you can select a <span data-keyword="subarray-nonempty">subarray</span> and replace it with a single element equal to its <strong>maximum</strong> value.</p>

<p>Return the <strong>maximum possible size</strong> of the array after performing zero or more operations such that the resulting array is <strong>non-decreasing</strong>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">nums = [4,2,5,3,5]</span></p>

<p><strong>Output:</strong> <span class="example-io">3</span></p>

<p><strong>Explanation:</strong></p>

<p>One way to achieve the maximum size is:</p>

<ol>
	<li>Replace subarray <code>nums[1..2] = [2, 5]</code> with <code>5</code> → <code>[4, 5, 3, 5]</code>.</li>
	<li>Replace subarray <code>nums[2..3] = [3, 5]</code> with <code>5</code> → <code>[4, 5, 5]</code>.</li>
</ol>

<p>The final array <code>[4, 5, 5]</code> is non-decreasing with size <font face="monospace">3.</font></p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">nums = [1,2,3]</span></p>

<p><strong>Output:</strong> <span class="example-io">3</span></p>

<p><strong>Explanation:</strong></p>

<p>No operation is needed as the array <code>[1,2,3]</code> is already non-decreasing.</p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 2 * 10<sup>5</sup></code></li>
	<li><code>1 &lt;= nums[i] &lt;= 2 * 10<sup>5</sup></code></li>
</ul>
</div>