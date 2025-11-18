public class Pair <TheType extends Comparable<TheType>> {
   private TheType firstVal;
   private TheType secondVal;

   public Pair(TheType aVal, TheType bVal){
      firstVal = aVal;
      secondVal = bVal;
   }

   public String toString() {
      return "[" + firstVal + ", " + secondVal + "]";
      }

   // Implement Comparable's expected compareTo()
   public int compareTo(Pair<TheType> otherPair) {
      int firstComparison = firstVal.compareTo(otherPair.firstVal);
      if (firstComparison != 0){
         return firstComparison;
      }
      return secondVal.compareTo(otherPair.secondVal);
   }

   // Return '<', '=', or '>' according to the ordering of this pair and otherPair
   public char comparisonSymbol(Pair<TheType> otherPair) {
      int comparisonResult = compareTo(otherPair);
      if (comparisonResult < 0){
         return '<';
      } else if (comparisonResult > 0) {
         return '>';
      } else {
         return '=';
      }
   }

}
