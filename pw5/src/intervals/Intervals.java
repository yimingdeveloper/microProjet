package intervals;

/**
 * This interface represents all operations offered on an expression involving 1D intervals and
 * binary operations on them.
 */
public interface Intervals {
  /**
   * Evaluate this expression of intervals and return the resulting interval.
   *
   * @return the result as an Interval object
   */
  Interval evaluate();


  /**
   * Returns a string that is the textual representation of the tree structure.
   *
   * @return a string in the above format
   */
  String textTree();
}