class Solution {
    public boolean isNumber(String s) {
	boolean hasSign = false;
	boolean hasExponent = false;
	int expIdx = -1;
	boolean hasDecimal = false;
	int decimalIdx = -1;
	boolean hasDigits = false;
	int idx = -1;
	while(++idx < s.length()) {
		char c = s.charAt(idx);
		if(c == '+' ||  c == '-') {
			if(hasSign && !hasExponent) {return false;}
			if(hasExponent && idx != expIdx + 1) {return false;}
			if(!hasSign && !hasExponent && idx != 0) {return false;}
			hasSign = true;
		} else if(c == '.'){
			if(hasDecimal) {return false;}
			hasDecimal = true;
			decimalIdx = idx;
			if(expIdx != -1 && decimalIdx > expIdx) {
				return false;
			}
		} else if (c == 'e' || c == 'E') {
			if(hasExponent) {return false;}
			hasExponent = true;
			if(!hasDigits) {return false;}
			expIdx = idx;
			if(decimalIdx != -1 && decimalIdx > expIdx) {
				return false;
			}
		} else if(c >= '0' && c <= '9') {
			hasDigits = true;
		} else {
			return false;
		}
	}
	if(!hasDigits) {return false;}
	if(hasSign && (s.charAt(s.length() - 1) == '+' || s.charAt(s.length() - 1) == '-')) {return false;}
	if(hasDecimal && hasExponent && !((decimalIdx-1 >= 0 && (s.charAt(decimalIdx-1) >= '0' && s.charAt(decimalIdx - 1) <= '9')) || (s.charAt(decimalIdx+1) >= '0' && s.charAt(decimalIdx + 1) <= '9'))) {return false;}
	if(hasExponent && (expIdx == 0 || expIdx == s.length() - 1)) {
		return false;
	}
	return true;
}
}