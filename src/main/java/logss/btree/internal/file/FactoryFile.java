package logss.btree.internal.file;

import java.io.File;

import logss.btree.Factory;
import logss.btree.Leaf;
import logss.btree.NonLeaf;
import logss.btree.Options;

public final class FactoryFile<K, V> implements Factory<K, V> {

    private final Options<K, V> options;
    private final File directory;
    private File indexFile;
    private File dataFile;

    public FactoryFile(Options<K, V> options, File directory) {
        this.options = options;
        this.directory = directory;
    }

    @Override
    public Leaf<K, V> createLeaf() {
        return new LeafFile<K, V>(options, this, nextLeafPosition());
    }

    private long nextLeafPosition() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public NonLeaf<K, V> createNonLeaf() {
        return new NonLeafFile<K, V>(this, nextNonLeafPosition());
    }

    private long nextNonLeafPosition() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void close() throws Exception {
        // TODO
    }

    public K key(long position, int i) {
        // TODO Auto-generated method stub
        return null;
    }

    public int numKeys(long position) {
        // TODO Auto-generated method stub
        return 0;
    }

    public V value(long position, int index) {
        // TODO Auto-generated method stub
        return null;
    }

    public void setNumKeys(long position, int numKeys) {
        // TODO Auto-generated method stub

    }

    public void setValue(long position, int idx, V value) {
        // TODO Auto-generated method stub

    }

}