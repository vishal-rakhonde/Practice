class Solution {
    private static final byte[] BIT_COUNT_TABLE = new byte[256];
    
    static {
        for (int i = 0; i < 256; i++) {
            BIT_COUNT_TABLE[i] = (byte) Integer.bitCount(i);
        }
    }
    
    public int minBitFlips(int start, int goal) {
        int xor = start ^ goal;
        return (BIT_COUNT_TABLE[xor & 0xff] +
                BIT_COUNT_TABLE[(xor >>> 8) & 0xff] +
                BIT_COUNT_TABLE[(xor >>> 16) & 0xff] +
                BIT_COUNT_TABLE[(xor >>> 24) & 0xff]);
    }
}