package millet.dai.study.adapter.v2.adapter;

import com.sun.istack.internal.NotNull;

public interface UserServiceAdapter  {
    boolean support(Object service);

    void doLogin(@NotNull String[] args, Object service);

    void doRegister(@NotNull String [] args, Object service);
}
