<h2> 75 248
521. Longest Uncommon Subsequence I</h2><hr><div><p>Given two strings <code>a</code> and <code>b</code>, return <em>the length of the <strong>longest uncommon subsequence</strong> between </em><code>a</code> <em>and</em> <code>b</code>. <em>If no such uncommon subsequence exists, return</em> <code>-1</code><em>.</em></p>

<p>An <strong>uncommon subsequence</strong> between two strings is a string that is a <strong><span data-keyword="subsequence-string">subsequence</span> of exactly one of them</strong>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> a = "aba", b = "cdc"
<strong>Output:</strong> 3
<strong>Explanation:</strong> One longest uncommon subsequence is "aba" because "aba" is a subsequence of "aba" but not "cdc".
Note that "cdc" is also a longest uncommon subsequence.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> a = "aaa", b = "bbb"
<strong>Output:</strong> 3
<strong>Explanation:</strong>&nbsp;The longest uncommon subsequences are "aaa" and "bbb".
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> a = "aaa", b = "aaa"
<strong>Output:</strong> -1
<strong>Explanation:</strong>&nbsp;Every subsequence of string a is also a subsequence of string b. Similarly, every subsequence of string b is also a subsequence of string a. So the answer would be <code>-1</code>.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= a.length, b.length &lt;= 100</code></li>
	<li><code>a</code> and <code>b</code> consist of lower-case English letters.</li>
</ul>
</div>