package com.alipay.sofa.jraft.example.election;

import com.alipay.sofa.jraft.entity.LeaderChangeContext;

public interface FollowerStateListener {
    void onStartFollowing(final LeaderChangeContext ctx);

    void onStopFollowing(final LeaderChangeContext ctx);
}
