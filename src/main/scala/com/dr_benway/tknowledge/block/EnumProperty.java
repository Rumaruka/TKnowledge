package com.dr_benway.tknowledge.block;


import net.minecraft.util.IStringSerializable;

public class EnumProperty {
	
	public enum EnumFountainType implements IStringSerializable {
		PILLAR_THAUMIUM(0, "pillar_thaumium"),
	    PILLAR_MIDDLE(1, "pillar_middle"),
	    PILLAR_TOP(2, "pillar_top"),
		SIDE_DIOPTRA_T(3, "side_dioptra_t"),
		FLOOR(4, "floor"),
		GHOST(5, "ghost"),
		WALL(6, "wall"),
		SIDE_DIOPTRA_B(7, "side_dioptra_b"),
		SIDE_DIOPTRA_V(8, "side_dioptra_v"),
		PILLAR_CUP(9, "pillar_cup"),
		PILLAR_BRASS(10, "pillar_brass"),
		PILLAR_VOID(11, "pillar_void");

	    private int ID;
	    private String name;
	    
	    private EnumFountainType(int ID, String name) {
	        this.ID = ID;
	        this.name = name;
	    }
	    
	    @Override
	    public String getName() {
	        return name;
	    }

	    public int getID() {
	        return ID;
	    }
	    
	    @Override
	    public String toString() {
	        return getName();
	    }
	}
	
	public enum EnumMiscType implements IStringSerializable {
		
		QS_CONS(0, "qs_cons"),
		QS_BLOCK(1, "qs_block");
		
		private int ID;
	    private String name;
	    
	    private EnumMiscType(int ID, String name) {
	        this.ID = ID;
	        this.name = name;
	    }
	    
	    @Override
	    public String getName() {
	        return name;
	    }

	    public int getID() {
	        return ID;
	    }
	    
	    @Override
	    public String toString() {
	        return getName();
	    }
	}
	
	public enum EnumSlabType implements IStringSerializable {
		
		QS_BLOCK(0, "qs_block");
		
		private int ID;
	    private String name;
	    
	    private EnumSlabType(int ID, String name) {
	        this.ID = ID;
	        this.name = name;
	    }
	    
	    @Override
	    public String getName() {
	        return name;
	    }

	    public int getID() {
	        return ID;
	    }
	    
	    @Override
	    public String toString() {
	        return getName();
	    }
	}
	
	public enum EnumTankType implements IStringSerializable {
		
		SIMPLE(0, "simple");
		
		private int ID;
	    private String name;
	    
	    private EnumTankType(int ID, String name) {
	        this.ID = ID;
	        this.name = name;
	    }
	    
	    @Override
	    public String getName() {
	        return name;
	    }

	    public int getID() {
	        return ID;
	    }
	    
	    @Override
	    public String toString() {
	        return getName();
	    }
		
	}
	
public enum EnumShelveType implements IStringSerializable {
		
		GREATWOOD(0, "greatwood"),
		SILVERWOOD(1, "silverwood");
		
		private int ID;
	    private String name;
	    
	    private EnumShelveType(int ID, String name) {
	        this.ID = ID;
	        this.name = name;
	    }
	    
	    @Override
	    public String getName() {
	        return name;
	    }

	    public int getID() {
	        return ID;
	    }
	    
	    @Override
	    public String toString() {
	        return getName();
	    }
		
	}
	

}
