package edu.hanyang;
 
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
 
import edu.hanyang.submit.TinySEBPlusTree;

@Ignore("Delete this line to unit test stage 3")
public class BPlusTreeTest {
 
	@Test
	public void bPlusTreeTest() throws IOException {
		String metapath = "./tmp/bplustree.meta";
		String savepath = "./tmp/bplustree.tree";
		int blocksize = 52;
		int nblocks = 10;
 
		File treefile = new File(savepath);
		File metafile = new File(metapath);
		if (treefile.exists()) {
			if (! treefile.delete()) {
				System.err.println("error: cannot remove tree file");
				System.exit(1);
			}
		}
		if (metafile.exists()) {
			if (! metafile.delete()) {
				System.err.println("error: cannot remove meta file");
				System.exit(1);
			}
		}

		TinySEBPlusTree tree = new TinySEBPlusTree();
		tree.open(metapath, savepath, blocksize, nblocks);
 
		tree.insert(5, 10);
		tree.insert(6, 15);
		tree.insert(4, 20);
		tree.insert(7, 1);
		tree.insert(8, 5);
		tree.insert(17, 7);
		tree.insert(30, 8);
		tree.insert(1, 8);
		tree.insert(58, 1);
		tree.insert(25, 8);
		tree.insert(96, 32);
		tree.insert(21, 8);
		tree.insert(9, 98);
		tree.insert(57, 54);
		tree.insert(157, 54);
		tree.insert(247, 54);
		tree.insert(357, 254);
		tree.insert(557, 54);
		tree.insert(558, 54);
		tree.insert(559, 54);
		tree.insert(560, 54);
		tree.insert(561, 54);
		tree.insert(562, 54);
		tree.insert(563, 54);
		tree.insert(564, 54);
		tree.insert(565, 54);
		tree.insert(566, 54);
		tree.insert(567, 54);
		tree.insert(568, 54);
		tree.insert(569, 54);
		tree.insert(570, 54);
		tree.insert(571, 54);
		tree.insert(572, 54);
		tree.insert(573, 54);
		tree.insert(574, 54);
		tree.insert(575, 54);
		tree.insert(576, 54);
		tree.insert(577, 54);
		tree.insert(578, 54);
		tree.insert(579, 54);
		tree.insert(580, 54);
		tree.insert(581, 54);
		tree.insert(582, 54);
		tree.insert(583, 54);
		tree.insert(584, 54);
		tree.insert(585, 54);
		tree.insert(586, 54);
		tree.insert(587, 54);
		tree.insert(588, 54);
		tree.insert(589, 54);
		tree.insert(590, 54);
		tree.insert(591, 54);
		tree.insert(592, 54);
		tree.insert(593, 54);
		tree.insert(594, 54);
		tree.insert(595, 54);
		tree.insert(596, 54);
		tree.insert(597, 54);
		tree.insert(598, 54);
		tree.insert(599, 54);
		tree.insert(600, 54);
		tree.insert(601, 54);
		tree.insert(602, 54);
		tree.insert(603, 54);
		tree.insert(604, 54);
		tree.insert(605, 54);
		tree.close();
 
		// check read and write and result of tree
		tree = new TinySEBPlusTree();
		tree.open(metapath, savepath, blocksize, nblocks);
 
		// Check search function
		assertEquals(tree.search(5), 10);
		assertEquals(tree.search(6), 15);
		assertEquals(tree.search(4), 20);
		assertEquals(tree.search(7), 1);
		assertEquals(tree.search(8), 5);
		assertEquals(tree.search(17), 7);
		assertEquals(tree.search(30), 8);
		assertEquals(tree.search(1), 8);
		assertEquals(tree.search(58), 1);
		assertEquals(tree.search(25), 8);
		assertEquals(tree.search(96), 32);
		assertEquals(tree.search(21), 8);
		assertEquals(tree.search(9), 98);
		assertEquals(tree.search(57), 54);
		assertEquals(tree.search(157), 54);
		assertEquals(tree.search(247), 54);
		assertEquals(tree.search(357), 254);
		assertEquals(tree.search(557), 54);
		assertEquals(tree.search(558), 54);
		assertEquals(tree.search(559), 54);
		assertEquals(tree.search(560), 54);
		assertEquals(tree.search(561), 54);
		assertEquals(tree.search(562), 54);
		assertEquals(tree.search(563), 54);
		assertEquals(tree.search(564), 54);
		assertEquals(tree.search(565), 54);
		assertEquals(tree.search(566), 54);
		assertEquals(tree.search(567), 54);
		assertEquals(tree.search(568), 54);
		assertEquals(tree.search(569), 54);
		assertEquals(tree.search(570), 54);
		assertEquals(tree.search(571), 54);
		assertEquals(tree.search(572), 54);
		assertEquals(tree.search(573), 54);
		assertEquals(tree.search(574), 54);
		assertEquals(tree.search(575), 54);
		assertEquals(tree.search(576), 54);
		assertEquals(tree.search(577), 54);
		assertEquals(tree.search(578), 54);
		assertEquals(tree.search(579), 54);
		assertEquals(tree.search(580), 54);
		assertEquals(tree.search(581), 54);
		assertEquals(tree.search(582), 54);
		assertEquals(tree.search(583), 54);
		assertEquals(tree.search(584), 54);
		assertEquals(tree.search(585), 54);
		assertEquals(tree.search(586), 54);
		assertEquals(tree.search(587), 54);
		assertEquals(tree.search(588), 54);
		assertEquals(tree.search(589), 54);
		assertEquals(tree.search(590), 54);
		assertEquals(tree.search(591), 54);
		assertEquals(tree.search(592), 54);
		assertEquals(tree.search(593), 54);
		assertEquals(tree.search(594), 54);
		assertEquals(tree.search(595), 54);
		assertEquals(tree.search(596), 54);
		assertEquals(tree.search(597), 54);
		assertEquals(tree.search(598), 54);
		assertEquals(tree.search(599), 54);
		assertEquals(tree.search(600), 54);
		assertEquals(tree.search(601), 54);
		assertEquals(tree.search(602), 54);
		assertEquals(tree.search(603), 54);
		assertEquals(tree.search(604), 54);
		assertEquals(tree.search(605), 54);



		tree.close();
	}
}