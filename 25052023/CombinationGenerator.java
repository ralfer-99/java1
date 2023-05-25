class CombinationGenerator {
    public static void generateCombinations(char [] chars)
    {
        generateCombinationsHelper(chars, "", 0);
    }

    private static void generateCombinationsHelper(char [] chars, String currentCombination, int index)
    {
        System.out.println(currentCombination);

        for(int i = index; i < chars.length; i++)
        {
            generateCombinationsHelper(chars, currentCombination + chars[i], i + 1);
        }
    }

    public static void main(String[] args) {
        char[] chars = { 'a', 'b' };
        generateCombinations(chars);
    }

}
