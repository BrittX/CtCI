"""
1.1 Is Unique: Implement an algorithm to determine if a string has all unique
	characters. What if you cannot use additional data structures?
"""

def isUnique(strchars):
	# list to hold characters we've seen already
	seen = []
	for item in strchars:
		if item not in seen:
			seen.append(item)
		# already seent it
		else: return False
	return True
"""
1.2 Check Permutation: Given two strings, write a method to decide
	if one is a permutation of the other
"""
def isPermutation(str1, str2):
	pass

"""
1.3 URLify: Write a method to replace all spaces in a string
	with '%20'. You may assume that the string has sufficient
	space at the end to hold the additional characters, and that
	you are given the "true" length of the string.
"""
def urlify(str1, lenstr1):
	test = []
	temp = list(str1)
	for letter in temp:
		if letter == ' ':
			print('yes') # letter = '%20'
			letter = '%20'
			test.append(letter)
		else: test.append(letter)
	return test

	# return temp

'''
1.5 One Away: There are three types of edits that can be performed
	on strings: insert a character, remove a character, or replace a
	character. Given two strings, write a function to check if they
	are one edit (or zero edits) away.

	Example:
		pale, ple -> true
		pales, pale -> true
		pale, bale, -> true
		pale, bake -> false
'''
def oneAway(s1, s2):
	# check if we can replace
	if (len(s1) == len(s2)):
		for let in len(s1):



# Testing
if __name__ == '__main__':
	tst = "ab8p 14 eleven" # False
	tst2 = "abcdefghijklmnop" # True
	tst3 = "Just trying to see if this thing works, ya know!" # False
	tst4 = "12394570" # true
	tests = [tst, tst2, tst3, tst4]
	for test in tests:
		print(isUnique(test))

	urltest = "Mr John Smith    "
	print(urlify(urltest, 13))
