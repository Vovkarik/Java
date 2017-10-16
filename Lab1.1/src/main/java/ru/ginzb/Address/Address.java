package ru.ginzb.Address;

class Address {
    
    private static int NUM_OF_TOKENS = 4;

    public static void main(String[] args) throws Throwable {
        if(args.length < 2) {
        	throw new Error("Lack of arguments, input format must be <IP Addres> <Mask>");
        }
        byte[] ip = parseArgument(args[0]);
        byte[] mask = parseArgument(args[1]);
        byte[] addr = getNetAddress(ip, mask);
        for (int j=0; j<addr.length; j++) {
            System.out.print(addr[j] & 0xFF);
            if (j < NUM_OF_TOKENS - 1) {
                System.out.print(".");
            }
        }
    }

    public static byte[] parseArgument(String arg) throws Throwable {
        if (arg.length() > 15 || arg.length() < 7) {
    		throw new Error("Argiment obviosly not an address-like");
        }
        String[] tokens = arg.split("[.]");
        byte[] result = new byte[NUM_OF_TOKENS];
        for (int i = 0; i < tokens.length; ++i) {
            try {
                result[i] = (byte) Integer.parseInt(tokens[i]);
            } catch (NumberFormatException ex) {
                throw new Error("Invalid number: " + tokens[i]);
            }
        }
        return result;
    }

    public static byte[] getNetAddress(byte[] ip, byte[] mask) {
        byte[] network = new byte[NUM_OF_TOKENS];
        for (int i = 0; i < network.length; i++) {
            network[i] = (byte) (ip[i] & mask[i]);
        }
        return network;
    }
}