
/* Program that simulates a traffic light. In the program lets the user select one of three lights: red, yellow, or green.
when a radio button is selected, the light is turned on, and only one light can be on at a time. No light is on when
the program starts. */

import java . awt .*;
import java . awt . event .*;
import javax . swing .*;

public class Traffic_Light 
{
    Traffic_Light ()
    {
        JFrame TL = new JFrame ( "Traffic light" );
        JPanel Ptop = new JPanel ();
        JPanel Pcenter = new JPanel ();
        JPanel Pbot = new JPanel ();
        JPanel Pleft = new JPanel ();
        JPanel Pcleft = new JPanel ();
        JPanel Pcright = new JPanel ();
        JPanel Pright = new JPanel ();

        JRadioButton b []= new JRadioButton [ 3 ];
        ButtonGroup bg = new ButtonGroup ();
        b [ 0 ]= new JRadioButton ( "Start" );
        b [ 0 ]. setBackground ( Color . WHITE );
        b [ 1 ]= new JRadioButton ( "Wait" );
        b [ 1 ]. setBackground ( Color . WHITE );
        b [ 2 ]= new JRadioButton ( "Stop" );
        b [ 2 ]. setBackground ( Color . WHITE );
        bg . add ( b [ 0 ]);
        bg . add ( b [ 1 ]);
        bg . add ( b [ 2 ]);

        Ptop . setBackground ( Color . BLACK );
        Pcenter . setBackground ( Color . BLACK );
        Pbot . setBackground ( Color . BLACK );
        Pleft . setBackground ( Color . BLACK );
        Pcleft . setBackground ( Color . BLACK );
        Pcright . setBackground ( Color . BLACK );
        Pright . setBackground ( Color . BLACK );
        Pcenter . add ( Pleft );
        Pcenter . add ( b [ 0 ]);
        Pcenter . add ( Pcleft );
        Pcenter . add ( b [ 1 ]);
        Pcenter . add ( Pcright );
        Pcenter . add ( b [ 2 ]);
        Pcenter . add ( Pright );
        Pcenter . setLayout ( new GridLayout ( 1 , 7 ));

        TL . add ( Ptop );
        TL . add ( Pcenter );
        TL . add ( Pbot );
        TL . setSize ( 450 , 300 );
        TL . setLayout ( new GridLayout ( 3 , 1 ));
        TL . setVisible ( true );
        TL . setDefaultCloseOperation ( JFrame . EXIT_ON_CLOSE );

        b [ 0 ]. addActionListener ( new ActionListener ()
        {
            public void actionPerformed ( ActionEvent e )
            {
                b [ 0 ]. setBackground ( Color . GREEN );
                b [ 1 ]. setBackground ( Color . WHITE );
                b [ 2 ]. setBackground ( Color . WHITE );
            }
        });

        b [ 1 ]. addActionListener ( new ActionListener ()
        {
            public void actionPerformed ( ActionEvent e )
            {
                b [ 0 ]. setBackground ( Color . WHITE );
                b [ 1 ]. setBackground ( Color . YELLOW );
                b [ 2 ]. setBackground ( Color . WHITE );
            }
        });

        b [ 2 ]. addActionListener ( new ActionListener ()
        {
            public void actionPerformed ( ActionEvent e )
            {
                b [ 0 ]. setBackground ( Color . WHITE );
                b [ 1 ]. setBackground ( Color . WHITE );
                b [ 2 ]. setBackground ( Color . RED );
            }
        });
    }
    public static void main ( String [] args )  
    {
        new Traffic_Light();
    }
}