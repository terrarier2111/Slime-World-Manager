package com.grinderwolf.swm.clsm;

public interface CLSMBridge {

    default Object getChunk(Object world, int x, int z) {
        return null;
    }

    default boolean saveChunk(Object world, Object chunkAccess) {
        return false;
    }

    // Array containing the normal world, the nether and the end
    Object[] getDefaultWorlds();

    boolean isCustomWorld(Object world);
}
