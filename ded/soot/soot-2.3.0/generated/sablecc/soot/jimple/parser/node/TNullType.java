/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.*;

public final class TNullType extends Token
{
    public TNullType()
    {
        super.setText("null_type");
    }

    public TNullType(int line, int pos)
    {
        super.setText("null_type");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TNullType(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTNullType(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TNullType text.");
    }
}
