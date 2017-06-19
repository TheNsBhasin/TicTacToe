package in.codingninjas.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    Button playAgain;
    TextView textView;
    int[] gameState={-1,-1,-1,-1,-1,-1,-1,-1,-1};
    int activePlayer=1;
    boolean gameOver=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        textView.setVisibility(View.INVISIBLE);

        playAgain = (Button) findViewById(R.id.playAgain);
        playAgain.setVisibility(View.INVISIBLE);

        b1=(ImageButton) findViewById(R.id.button1);
        b2=(ImageButton) findViewById(R.id.button2);
        b3=(ImageButton) findViewById(R.id.button3);
        b4=(ImageButton) findViewById(R.id.button4);
        b5=(ImageButton) findViewById(R.id.button5);
        b6=(ImageButton) findViewById(R.id.button6);
        b7=(ImageButton) findViewById(R.id.button7);
        b8=(ImageButton) findViewById(R.id.button8);
        b9=(ImageButton) findViewById(R.id.button9);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(gameState[0]==-1) {
                    if(activePlayer==1) {
                        b1.setImageResource(R.drawable.cross);
                        gameState[0]=1;
                        activePlayer=2;
                    }
                    else {
                        b1.setImageResource(R.drawable.zero);
                        gameState[0]=2;
                        activePlayer=1;
                    }
                    endGame();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(gameState[1]==-1) {
                    if(activePlayer==1) {
                        b2.setImageResource(R.drawable.cross);
                        gameState[1]=1;
                        activePlayer=2;
                    }
                    else {
                        b2.setImageResource(R.drawable.zero);
                        gameState[1]=2;
                        activePlayer=1;
                    }
                    endGame();
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(gameState[2]==-1 && !gameOver) {
                    if(activePlayer==1) {
                        b3.setImageResource(R.drawable.cross);
                        gameState[2]=1;
                        activePlayer=2;
                    }
                    else {
                        b3.setImageResource(R.drawable.zero);
                        gameState[2]=2;
                        activePlayer=1;
                    }
                    endGame();
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(gameState[3]==-1 && !gameOver) {
                    if(activePlayer==1) {
                        b4.setImageResource(R.drawable.cross);
                        gameState[3]=1;
                        activePlayer=2;
                    }
                    else {
                        b4.setImageResource(R.drawable.zero);
                        gameState[3]=2;
                        activePlayer=1;
                    }
                    endGame();
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(gameState[4]==-1 && !gameOver) {
                    if(activePlayer==1) {
                        b5.setImageResource(R.drawable.cross);
                        gameState[4]=1;
                        activePlayer=2;
                    }
                    else {
                        b5.setImageResource(R.drawable.zero);
                        gameState[4]=2;
                        activePlayer=1;
                    }
                    endGame();
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(gameState[5]==-1 && !gameOver) {
                    if(activePlayer==1) {
                        b6.setImageResource(R.drawable.cross);
                        gameState[5]=1;
                        activePlayer=2;
                    }
                    else {
                        b6.setImageResource(R.drawable.zero);
                        gameState[5]=2;
                        activePlayer=1;
                    }
                    endGame();
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(gameState[6]==-1 && !gameOver) {
                    if(activePlayer==1) {
                        b7.setImageResource(R.drawable.cross);
                        gameState[6]=1;
                        activePlayer=2;
                    }
                    else {
                        b7.setImageResource(R.drawable.zero);
                        gameState[6]=2;
                        activePlayer=1;
                    }
                    endGame();
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(gameState[7]==-1 & !gameOver) {
                    if(activePlayer==1) {
                        b8.setImageResource(R.drawable.cross);
                        gameState[7]=1;
                        activePlayer=2;
                    }
                    else {
                        b8.setImageResource(R.drawable.zero);
                        gameState[7]=2;
                        activePlayer=1;
                    }
                    endGame();
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(gameState[8]==-1 && !gameOver) {
                    if(activePlayer==1) {
                        b9.setImageResource(R.drawable.cross);
                        gameState[8]=1;
                        activePlayer=2;
                    }
                    else {
                        b9.setImageResource(R.drawable.zero);
                        gameState[8]=2;
                        activePlayer=1;
                    }
                    endGame();
                }
            }
        });
        playAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.recreate();
            }
        });
    }

    public void endGame() {
        if(gameState[0] == gameState[1] && gameState[0]== gameState[2] && gameState[0]==1) {
            textView.setText("Winner Player X!");
            textView.setVisibility(View.VISIBLE);
            playAgain.setVisibility(View.VISIBLE);
            gameOver=true;
        }
        if(gameState[0] == gameState[3] && gameState[0]== gameState[6] && gameState[0]==1) {
            textView.setText("Winner Player X!");
            textView.setVisibility(View.VISIBLE);
            playAgain.setVisibility(View.VISIBLE);
            gameOver=true;
        }
        if(gameState[0] == gameState[4] && gameState[0]== gameState[8] && gameState[0]==1) {
            textView.setText("Winner Player X!");
            textView.setVisibility(View.VISIBLE);
            playAgain.setVisibility(View.VISIBLE);
            gameOver=true;
        }
        if(gameState[1] == gameState[4] && gameState[1]== gameState[7] && gameState[1]==1) {
            textView.setText("Winner Player X!");
            textView.setVisibility(View.VISIBLE);
            playAgain.setVisibility(View.VISIBLE);
            gameOver=true;
        }
        if(gameState[2] == gameState[5] && gameState[1]== gameState[8] && gameState[2]==1) {
            textView.setText("Winner Player X!");
            textView.setVisibility(View.VISIBLE);
            playAgain.setVisibility(View.VISIBLE);
            gameOver=true;
        }
        if(gameState[2] == gameState[4] && gameState[2]== gameState[6] && gameState[2]==1) {
            textView.setText("Winner Player X!");
            textView.setVisibility(View.VISIBLE);
            playAgain.setVisibility(View.VISIBLE);
            gameOver=true;
        }
        if(gameState[3] == gameState[4] && gameState[3]== gameState[5] && gameState[3]==1) {
            textView.setText("Winner Player X!");
            textView.setVisibility(View.VISIBLE);
            playAgain.setVisibility(View.VISIBLE);
            gameOver=true;
        }
        if(gameState[6] == gameState[7] && gameState[6]== gameState[8] && gameState[6]==1) {
            textView.setText("Winner Player X!");
            textView.setVisibility(View.VISIBLE);
            playAgain.setVisibility(View.VISIBLE);
            gameOver=true;
        }
        if(gameState[0] == gameState[1] && gameState[0]== gameState[2] && gameState[0]==2) {
            textView.setText("Winner Player O!");
            textView.setVisibility(View.VISIBLE);
            playAgain.setVisibility(View.VISIBLE);
            gameOver=true;
        }
        if(gameState[0] == gameState[3] && gameState[0]== gameState[6] && gameState[0]==2) {
            textView.setText("Winner Player O!");
            textView.setVisibility(View.VISIBLE);
            playAgain.setVisibility(View.VISIBLE);
            gameOver=true;
        }
        if(gameState[0] == gameState[4] && gameState[0]== gameState[8] && gameState[0]==2) {
            textView.setText("Winner Player O!");
            textView.setVisibility(View.VISIBLE);
            playAgain.setVisibility(View.VISIBLE);
            gameOver=true;
        }
        if(gameState[1] == gameState[4] && gameState[1]== gameState[7] && gameState[1]==2) {
            textView.setText("Winner Player O!");
            textView.setVisibility(View.VISIBLE);
            playAgain.setVisibility(View.VISIBLE);
            gameOver=true;
        }
        if(gameState[2] == gameState[5] && gameState[2]== gameState[8] && gameState[2]==2) {
            textView.setText("Winner Player O!");
            textView.setVisibility(View.VISIBLE);
            playAgain.setVisibility(View.VISIBLE);
            gameOver=true;
        }
        if(gameState[2] == gameState[4] && gameState[2]== gameState[6] && gameState[2]==2) {
            textView.setText("Winner Player O!");
            textView.setVisibility(View.VISIBLE);
            playAgain.setVisibility(View.VISIBLE);
            gameOver=true;
        }
        if(gameState[3] == gameState[4] && gameState[3]== gameState[5] && gameState[3]==2) {
            textView.setText("Winner Player O!");
            textView.setVisibility(View.VISIBLE);
            playAgain.setVisibility(View.VISIBLE);
            gameOver=true;
        }
        if(gameState[6] == gameState[7] && gameState[6]== gameState[8] && gameState[6]==2) {
            textView.setText("Winner Player O!");
            textView.setVisibility(View.VISIBLE);
            playAgain.setVisibility(View.VISIBLE);
            gameOver=true;
        }
        if(!gameOver) {
            for(int i=0;i<gameState.length;i++) {
                if (gameState[i] == -1)
                    return;
            }
            textView.setText("Game Draw!");
            textView.setVisibility(View.VISIBLE);
            playAgain.setVisibility(View.VISIBLE);
            gameOver=true;
        }
    }
}
