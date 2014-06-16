/**
 * OpenDSE is free software: you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 * 
 * OpenDSE is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with OpenDSE. If not, see http://www.gnu.org/licenses/.
 */
package net.sf.opendse.model;

/**
 * The {@code Node} is the basic vertex element in a {@link Graph}.
 * 
 * 
 * @author Martin Lukasiewycz
 * 
 */
public abstract class Node extends Element {

	/**
	 * Constructs a new node.
	 * 
	 * @param id
	 *            the id
	 */
	public Node(String id) {
		super(id);
	}

	/**
	 * Constructs a new node.
	 * 
	 * @param parent
	 *            the parent
	 */
	public Node(Element parent) {
		super(parent);
	}

}
