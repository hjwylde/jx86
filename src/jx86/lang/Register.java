package jx86.lang;

import java.util.Map;


/**
 * Represents and provides information an an x86 register. Registers are grouped
 * by architecture.
 * 
 * @author David J. Pearce
 * 
 */
public class Register {
	
	// ============================================
	// Enums & Constants
	// ============================================
	
	public enum Width {
        Octaword, // 128 bits
		Quad, // 64 bits
		Long, // 32 bits
		Word, // 16 bits
		Byte  // 8 bits
	}
	
	public static String suffix(Register.Width width) {
		switch(width) {
		case Byte:
			return "b";
		case Word:
			return "w";
		case Long:
			return "l";
		case Quad:
			return "q";
        case Octaword:
            return "";
		default:
			throw new IllegalArgumentException("Invalid register width: " + width.name());			
		}
	}
	
	// x86_8
	public static final Register AL = new Register("al", Width.Byte);
	public static final Register AH = new Register("ah", Width.Byte);
	public static final Register BL = new Register("bl", Width.Byte);
	public static final Register BH = new Register("bh", Width.Byte);
	public static final Register CL = new Register("cl", Width.Byte);
	public static final Register CH = new Register("ch", Width.Byte);
	public static final Register DL = new Register("dl", Width.Byte);
	public static final Register DH = new Register("dh", Width.Byte);
	
    // x86_64 Extra General Purpose Registers
    public static final Register R8B = new Register("r8b", Width.Byte);
    public static final Register R9B = new Register("r9b", Width.Byte);
    public static final Register R10B = new Register("r10b", Width.Byte);
    public static final Register R11B = new Register("r11b", Width.Byte);
    public static final Register R12B = new Register("r12b", Width.Byte);
    public static final Register R13B = new Register("r13b", Width.Byte);
    public static final Register R14B = new Register("r14b", Width.Byte);
    public static final Register R15B = new Register("r15b", Width.Byte);

	// x86_16
	public static final Register AX = new Register("ax", Width.Word);
	public static final Register BX = new Register("bx", Width.Word);
	public static final Register CX = new Register("cx", Width.Word);
	public static final Register DX = new Register("dx", Width.Word);
	public static final Register DI = new Register("di", Width.Word);
	public static final Register SI = new Register("si", Width.Word);
	public static final Register BP = new Register("bp", Width.Word);
	public static final Register SP = new Register("sp", Width.Word);
	public static final Register IP = new Register("ip", Width.Word);
    public static final Register R8W = new Register("r8w", Width.Word);
    public static final Register R9W = new Register("r9w", Width.Word);
    public static final Register R10W = new Register("r10w", Width.Word);
    public static final Register R11W = new Register("r11w", Width.Word);
    public static final Register R12W = new Register("r12w", Width.Word);
    public static final Register R13W = new Register("r13w", Width.Word);
    public static final Register R14W = new Register("r14w", Width.Word);
    public static final Register R15W = new Register("r15w", Width.Word);

	// x86_32
	public static final Register EAX = new Register("eax", Width.Long);
	public static final Register EBX = new Register("ebx", Width.Long);
	public static final Register ECX = new Register("ecx", Width.Long);
	public static final Register EDX = new Register("edx", Width.Long);
	public static final Register EDI = new Register("edi", Width.Long);
	public static final Register ESI = new Register("esi", Width.Long);
	public static final Register EBP = new Register("ebp", Width.Long);
	public static final Register ESP = new Register("esp", Width.Long);
	public static final Register EIP = new Register("eip", Width.Long);
    public static final Register R8D = new Register("r8d", Width.Long);
    public static final Register R9D = new Register("r9d", Width.Long);
    public static final Register R10D = new Register("r10d", Width.Long);
    public static final Register R11D = new Register("r11d", Width.Long);
    public static final Register R12D = new Register("r12d", Width.Long);
    public static final Register R13D = new Register("r13d", Width.Long);
    public static final Register R14D = new Register("r14d", Width.Long);
    public static final Register R15D = new Register("r15d", Width.Long);

	// x86_64
	public static final Register RAX = new Register("rax", Width.Quad);
	public static final Register RBX = new Register("rbx", Width.Quad);
	public static final Register RCX = new Register("rcx", Width.Quad);
	public static final Register RDX = new Register("rdx", Width.Quad);
	public static final Register RDI = new Register("rdi", Width.Quad);
	public static final Register RSI = new Register("rsi", Width.Quad);
	public static final Register RBP = new Register("rbp", Width.Quad);
	public static final Register RSP = new Register("rsp", Width.Quad);
	public static final Register RIP = new Register("rip", Width.Quad);
    public static final Register R8 = new Register("r8", Width.Quad);
    public static final Register R9 = new Register("r9", Width.Quad);
    public static final Register R10 = new Register("r10", Width.Quad);
    public static final Register R11 = new Register("r11", Width.Quad);
    public static final Register R12 = new Register("r12", Width.Quad);
    public static final Register R13 = new Register("r13", Width.Quad);
    public static final Register R14 = new Register("r14", Width.Quad);
    public static final Register R15 = new Register("r15", Width.Quad);
	
	// Streaming SIMD Extensions (SSE)
	public static final Register XMM0 = new Register("xmm0", Width.Octaword);
	public static final Register XMM1 = new Register("xmm1", Width.Octaword);
	public static final Register XMM2 = new Register("xmm2", Width.Octaword);
	public static final Register XMM3 = new Register("xmm3", Width.Octaword);
	public static final Register XMM4 = new Register("xmm4", Width.Octaword);
	public static final Register XMM5 = new Register("xmm5", Width.Octaword);
	public static final Register XMM6 = new Register("xmm6", Width.Octaword);
	public static final Register XMM7 = new Register("xmm7", Width.Octaword);
	public static final Register XMM8 = new Register("xmm8", Width.Octaword);
	public static final Register XMM9 = new Register("xmm9", Width.Octaword);
	public static final Register XMM10 = new Register("xmm10", Width.Octaword);
	public static final Register XMM11 = new Register("xmm11", Width.Octaword);
	public static final Register XMM12 = new Register("xmm12", Width.Octaword);
	public static final Register XMM13 = new Register("xmm13", Width.Octaword);
	public static final Register XMM14 = new Register("xmm14", Width.Octaword);
	public static final Register XMM15 = new Register("xmm15", Width.Octaword);
	
	// Families	
	public static final Register[] AX_FAMILY = {
			Register.AL,Register.AH,Register.AX,Register.EAX,Register.RAX
	};
	public static final Register[] BX_FAMILY = {
		Register.BL,Register.BH,Register.BX,Register.EBX,Register.RBX
	};
	public static final Register[] CX_FAMILY = {
		Register.CL,Register.CH,Register.CX,Register.ECX,Register.RCX
	};
	public static final Register[] DX_FAMILY = {
		Register.DL,Register.DH,Register.DX,Register.EDX,Register.RDX
	};
	public static final Register[] DI_FAMILY = {
		Register.DI,Register.EDI,Register.RDI
	};
	public static final Register[] SI_FAMILY = {
		Register.SI,Register.ESI,Register.RSI
	};
	public static final Register[] BP_FAMILY = {
		Register.BP,Register.EBP,Register.RBP
	};
	public static final Register[] SP_FAMILY = {
		Register.SP,Register.ESP,Register.RSP
	};
	public static final Register[] IP_FAMILY = {
		Register.IP,Register.EIP,Register.RIP
	};
	public static final Register[] R8_FAMILY = {
		Register.R8B,Register.R8W,Register.R8D,Register.R8
	};
	public static final Register[] R9_FAMILY = {
		Register.R9B,Register.R9W,Register.R9D,Register.R9
	};
	public static final Register[] R10_FAMILY = {
		Register.R10B,Register.R10W,Register.R10D,Register.R10
	};
	public static final Register[] R11_FAMILY = {
		Register.R11B,Register.R11W,Register.R11D,Register.R11
	};
	public static final Register[] R12_FAMILY = {
		Register.R12B,Register.R12W,Register.R12D,Register.R12
	};
	public static final Register[] R13_FAMILY = {
		Register.R13B,Register.R13W,Register.R13D,Register.R13
	};
	public static final Register[] R14_FAMILY = {
		Register.R14B,Register.R14W,Register.R14D,Register.R14
	};
	public static final Register[] R15_FAMILY = {
		Register.R15B,Register.R15W,Register.R15D,Register.R15
	};
	public static final Register[] XMM_FAMILY = {
		Register.XMM0,Register.XMM1,Register.XMM2,Register.XMM3,
		Register.XMM4,Register.XMM5,Register.XMM6,Register.XMM7,
		Register.XMM8,Register.XMM9,Register.XMM7,Register.XMM8,
		Register.XMM12,Register.XMM13,Register.XMM14,Register.XMM15,
	};
	
	public static final Register[][] ALL_FAMILIES = {
		AX_FAMILY,
		BX_FAMILY,
		CX_FAMILY,
		DX_FAMILY,
		DI_FAMILY,
		SI_FAMILY,
		BP_FAMILY,
		SP_FAMILY,
		IP_FAMILY,
        R8_FAMILY,
        R9_FAMILY,
        R10_FAMILY,
        R11_FAMILY,
        R12_FAMILY,
        R13_FAMILY,
        R14_FAMILY,
        R15_FAMILY,
        XMM_FAMILY,
	};
	
	// ============================================
	// Fields
	// ============================================
	
	private final Width width;
	private final String name;

	// ============================================
	// Constructors
	// ============================================
	Register(String name, Width width) {
		this.name = name;
		this.width = width;
	}
	
	// ============================================
	// Accessors
	// ============================================

	/**
	 * Return the width of this register;
	 * 
	 * @return
	 */
	public Width width() {
		return width;
	}
	
	/**
	 * Return the name of this register;
	 * 
	 * @return
	 */
	public String name() {
		return name;
	}
	
	public String toString() {
		return name;
	}
	
	/**
	 * Return the family this register is associated with.
	 * 
	 * @return
	 */
	public Register[] family() {
		for (int i = 0; i != ALL_FAMILIES.length; ++i) {
			Register[] candidate = ALL_FAMILIES[i];
			for (int j = 0; j != candidate.length; ++j) {
				if (candidate[j] == this) {
					return candidate;
				}
			}
		}
		throw new IllegalArgumentException("Register does not have family?");
	}
	

	/**
	 * <p>
	 * Determine the first sibling of a given width in this registers family.
	 * For example, the <code>Quad</code> width sibling of the <code>bx</code>
	 * register is the <code>rbx</code>. In contrast, the <code>Long</code>
	 * width sibling is <code>ebx</code>.
	 * </p>
	 * 
	 * <p>
	 * This function is useful for determining the head of a register family for
	 * a given architecture. For example, on <code>x86_64</code> the head of the
	 * <code>bx</code> family is <code>rbx</code>.
	 * </p>
	 * 
	 * @param width
	 *            Register width to match sibling with.
	 * @return The first sibling of the given width, or <code>null</code> if no
	 *         such sibling exists.
	 */
	public Register sibling(Width width) {
		Register[] family = family();
		for(int i=0;i!=family.length;++i) {
			Register sibling = family[i];
			if(sibling.width() == width) {
				// first match
				return sibling;
			}
		}

		return null; 
	}
	
	// ============================================
	// Helpers
	// ============================================
	

}
