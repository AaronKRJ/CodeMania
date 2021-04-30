package ListPractice;

import javax.swing.*;



class GUI
{
    // Outside Variables
    static JFrame frame;
    static JPanel panel;
    static JButton button;
    static JLabel label;

    public static void makeGUI()
    {
        // Button (Adds Nums)
        button = new JButton("Click me");
        button.setFocusable(false);

        // Label (Text)
        label = new JLabel("Yes");

        // Panel (Holds Objects)
        panel = new JPanel();
        panel.add(button);
        panel.add(label);

        // Main Window
        frame = new JFrame("Testing Lists");
        frame.setVisible(true);
        frame.setFocusable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.add(panel);


    }
}
