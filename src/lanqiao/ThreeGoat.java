package lanqiao;

/**
 * @author Prongs
 * @date 2020/10/8
 */
public class ThreeGoat {
    public static void main(String[] args) {
        for (int x1 = 0; x1 < 10; x1++) {
            for (int x2 = 0; x2 < 10; x2++) {
                if (x2 == x1) {
                    continue;
                }
                for (int x3 = 0; x3 < 10; x3++) {
                    if (x3 == x1 || x3 == x2) {
                        continue;
                    }
                    for (int x4 = 0; x4 < 10; x4++) {
                        if (x4 == x1 || x4 == x2 || x4 == x3) {
                            continue;
                        }
                        for (int x5 = 0; x5 < 10; x5++) {
                            if (x5 == x1 || x5 == x2 || x5 == x3 || x5 == x4) {
                                continue;
                            }
                            for (int x6 = 0; x6 < 10; x6++) {
                                if (x6 == x1 || x6 == x2 || x6 == x3 || x6 == x4 || x6 == x5) {
                                    continue;
                                }
                                for (int x7 = 0; x7 < 10; x7++) {
                                    if (x7 == x1 || x7 == x2 || x7 == x3 || x7 == x4 || x7 == x5 || x7 == x6) {
                                        continue;
                                    }
                                    for (int x8 = 0; x8 < 10; x8++) {
                                        if (x8 == x1 || x8 == x2 || x8 == x3 || x8 == x4 || x8 == x5 || x8 == x6 || x8 == x7) {
                                            continue;
                                        }
                                        if (x1 == 0 || x5 == 0) {
                                            continue;
                                        }
                                        int x = x1 * 1000 + x2 * 100 + x3 * 10 + x4;
                                        int y = x5 * 1000 + x6 * 100 + x7 * 10 + x2;
                                        int z = x5 * 10000 + x6 * 1000 + x3 * 100 + x2 * 10 + x8;
                                        if (x + y == z) {
                                            System.out.println(x5 + "" + x6 + "" + x7 + "" + x2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            }
        }
    }
}
