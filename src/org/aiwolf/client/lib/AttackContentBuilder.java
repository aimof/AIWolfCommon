/**
 * AttackContentBuilder.java
 * 
 * Copyright (c) 2016 人狼知能プロジェクト
 */
package org.aiwolf.client.lib;

import org.aiwolf.common.data.Agent;

/**
 * <div lang="ja">襲撃発話ビルダークラス</div>
 * 
 * <div lang="en">Builder class for the utterance of attack.</div>
 * 
 * @author otsuki
 *
 */
public class AttackContentBuilder extends ContentBuilder {

	/**
	 * <div lang="ja">{@code target}を襲撃する意思表明のためのAttackContentBuilderを構築する</div>
	 *
	 * <div lang="en">Constructs an AttackContentBuilder for the declaration of attacking {@code target}.</div>
	 * 
	 * @param target
	 *            <div lang="ja">被襲撃エージェント</div>
	 * 
	 *            <div lang="en">The agent the utterer will attack.</div>
	 * 
	 */
	public AttackContentBuilder(Agent target) {
		topic = Topic.ATTACK;
		this.target = target;
	}

	@Override
	String getText() {
		return String.join(" ", new String[] { Topic.ATTACK.toString(), String.valueOf(target.toString()) });
	}

}
