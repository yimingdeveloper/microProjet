package genericnode;

/**
 * Node for numeric values only.
 *
 * @param <T> Type of value of the node.
 */
public class LeafNode<T> extends AbstractTreeNode<T> {

  /**
   * Constructor of genericNode.LeafNode.
   *
   * @param value Value of current leaf node.
   */
  public LeafNode(T value) {
    super(value);
  }
}
