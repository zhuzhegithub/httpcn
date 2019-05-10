package pulldata.yunshi;

import common.Ignore;

import java.util.*;

/**
 * @author zhuzhe
 * @date 2019/3/11 16:06
 * @email zhuzhe_mail@163.com
 */
@Ignore
public class CreateData {

    public static void main(String[] args) {

        // 财位
        List<String> list财位 = new ArrayList<>();
        list财位.add("正东");
        list财位.add("正西");
        list财位.add("正南");
        list财位.add("正北");
        list财位.add("东北");
        list财位.add("西北");
        list财位.add("东南");
        list财位.add("西南");

        // 桃花位
        List<String> list桃花位 = new ArrayList<>();
        list桃花位.add("南方");
        list桃花位.add("西方");
        list桃花位.add("北方");
        list桃花位.add("东方");

        // 幸运数字
        List<String> list幸运数字 = new ArrayList<>();
        list幸运数字.add("一");
        list幸运数字.add("二");
        list幸运数字.add("三");
        list幸运数字.add("四");
        list幸运数字.add("五");
        list幸运数字.add("六");
        list幸运数字.add("七");
        list幸运数字.add("八");
        list幸运数字.add("九");
        list幸运数字.add("零");

        // 吉祥色彩
        List<String> list吉祥色彩 = new ArrayList<>();
        list吉祥色彩.add("红");
        list吉祥色彩.add("橙");
        list吉祥色彩.add("黄");
        list吉祥色彩.add("绿");
        list吉祥色彩.add("青");
        list吉祥色彩.add("蓝");
        list吉祥色彩.add("紫");

        // 开运食物
        List<String> list开运食物 = new ArrayList<>();
        list开运食物.add("鸡蛋");
        list开运食物.add("土豆");
        list开运食物.add("芹菜");
        list开运食物.add("西红柿");
        list开运食物.add("黄瓜");
        list开运食物.add("牛奶");
        list开运食物.add("螃蟹");
        list开运食物.add("鱼");
        list开运食物.add("虾");
        list开运食物.add("鸡肉");

        list开运食物.add("猪肉");
        list开运食物.add("面条");
        list开运食物.add("米饭");
        list开运食物.add("西瓜");
        list开运食物.add("苹果");
        list开运食物.add("香蕉");
        list开运食物.add("莲菜");
        list开运食物.add("葡萄");
        list开运食物.add("豆芽");
        list开运食物.add("豆腐");

        list开运食物.add("胡萝卜");
        list开运食物.add("菠菜");
        list开运食物.add("白菜");
        list开运食物.add("牛肉");
        list开运食物.add("羊肉");
        list开运食物.add("白萝卜");
        list开运食物.add("红枣");
        list开运食物.add("枸杞");
        list开运食物.add("乳鸽");
        list开运食物.add("绿茶");

        list开运食物.add("红茶");
        list开运食物.add("菠萝");
        list开运食物.add("香菇");
        list开运食物.add("冬瓜");
        list开运食物.add("葡萄干、荔枝");
        list开运食物.add("菠萝蜜、面包");
        list开运食物.add("茶叶蛋");
        list开运食物.add("兔肉、野味");
        list开运食物.add("杨桃、瓜子");
        list开运食物.add("坚果、杏仁");

        list开运食物.add("红枣、枸杞");
        list开运食物.add("猪肉、桂圆");
        list开运食物.add("螃蟹、虾");
        list开运食物.add("芹菜、菠菜");
        list开运食物.add("葡萄、香蕉");


        List<YunShiResult3> result = new ArrayList<>();

        for (String s : list财位) {
            for (String s1 : list桃花位) {
                for (String s2 : list幸运数字) {
                    for (String s3 : list吉祥色彩) {
                        for (String s4 : list开运食物) {
//                            result.add(s + ": " + s1 + ":" + s2 + ":" + s3 + ":" + s4);
                            YunShiResult3 yunShiResult3 = new YunShiResult3();
                            yunShiResult3.setFinancialPosition(s);
                            yunShiResult3.setGoodLuckPosition(s1);
                            yunShiResult3.setGoodLuckNumber(s2);
                            yunShiResult3.setGoodLuckColor(s3);
                            yunShiResult3.setGoodLuckFood(s4);
                            result.add(yunShiResult3);
                        }
                    }
                }
            }
        }

        Collections.shuffle(result);

        List<String> re = getStrings();

        for (int i = 0; i < result.size(); i++) {

            int i1 = i % re.size();
            result.get(i).setMaxim(re.get(i1));

        }

        List<YunShiResult3> yunShiResult3s = Test.yunShiResult3s(result.size());

        List<Integer> scoreList = Arrays.asList(72, 74, 78, 75, 80, 81, 82, 83, 84, 85, 86, 88, 86, 83, 82, 87, 88, 89, 90, 91, 92, 93, 95, 96, 97, 98);

        for (int i = 0; i < result.size(); i++) {
            result.get(i).setJi(yunShiResult3s.get(i).getJi());
            result.get(i).setYi(yunShiResult3s.get(i).getYi());

            Collections.shuffle(scoreList);

            result.get(i).setScore(scoreList.get(4));
        }

        System.out.println("ok");
    }

    private static List<String> getStrings() {
        List<String> re = new ArrayList<>();
        re.add("只知道刚的人，难免会被折断；只有柔的人，到头来终是懦夫。");
        re.add("越努力，越幸运。");
        re.add("当我们太忙于低头赶路，以致错过了太多美好的风景。");
        re.add("勿问成功的秘诀为何，且尽全力做你应该做的事吧。");
        re.add("当我们太忙于低头赶路，以致错过了太多美好的风景。");
        re.add("苦难犹如乌云，远望去但见墨黑一片，然而身临其下时不过是灰色而已。");
        re.add("积极的人在每一次忧患中都看到一个机会， 而消极的人则在每个机会都看到某种忧患。");
        re.add("当我们太忙于低头赶路，以致错过了太多美好的风景。");
        re.add("思路决定出路，气度决定高度，细节决定成败，性格决定命运。");
        re.add("人生在世，难免会有困难，面对它，有人退后，有人原地不动，有人跨越它。");
        re.add("择高处立，就平处坐，向宽处行。");
        re.add("时间只负责流动，不负责育你成长。");
        re.add("反复地一浮一沉，对于一个人来说，正是磨练。");
        re.add("一个最困苦、最卑贱、最为命运所屈辱的人，只要还抱有希望，便无所怨惧。");
        re.add("当我们太忙于低头赶路，以致错过了太多美好的风景。");
        re.add("积极的人在每一次忧患中都看到一个机会， 而消极的人则在每个机会都看到某种忧患。");
        re.add("烈火试真金，逆境试强者。");
        re.add("勿问成功的秘诀为何，且尽全力做你应该做的事吧。");
        re.add("思路决定出路，气度决定高度，细节决定成败，性格决定命运。");
        re.add("积极的人在每一次忧患中都看到一个机会， 而消极的人则在每个机会都看到某种忧患。");
        re.add("沉默，是一种坚强。稻熟低穗，人熟低声。");
        re.add("苦难犹如乌云，远望去但见墨黑一片，然而身临其下时不过是灰色而已。");
        re.add("人的一生其实不过三天：昨天、今天和明天。");
        re.add("真正的快乐，多数时候与金钱无关。");
        re.add("烈火试真金，逆境试强者。");
        re.add("苦难犹如乌云，远望去但见墨黑一片，然而身临其下时不过是灰色而已。");
        re.add("积极的人在每一次忧患中都看到一个机会， 而消极的人则在每个机会都看到某种忧患。");
        re.add("当我们太忙于低头赶路，以致错过了太多美好的风景。");
        re.add("该放弃的决不挽留，该珍惜的决不放手。");
        re.add("所有的果实，都曾是鲜花，但并非所有的鲜花最终都能成为果实。");
        re.add("不幸往往来自比较，而幸福也是来自比较。");
        re.add("当我们太忙于低头赶路，以致错过了太多美好的风景。");
        re.add("每个人都有潜在的能量，只是很容易被习惯所掩盖，被时间所迷离，被惰性所消磨。");
        re.add("奇迹有时候是会发生的，但是你得为之拼命地努力。");
        re.add("人生没有如果，只有后果和结果。");
        re.add("你必须煞有介事地处理毫无意义，从无意义中创造意义。");
        re.add("每个人都有潜在的能量，只是很容易被习惯所掩盖，被时间所迷离，被惰性所消磨。");
        re.add("只知道刚的人，难免会被折断；只有柔的人，到头来终是懦夫。");
        re.add("流水在碰到底处时才会释放活力。");
        re.add("只知道刚的人，难免会被折断；只有柔的人，到头来终是懦夫。");
        re.add("命需要奋斗，奋斗与不奋斗，造就的结果截然不同。");
        re.add("我们选择不了生命，但我们可以选择走过生命的方式。");
        re.add("自我要求是迈向成功的捷径，恒心是离成功最短的路。");
        re.add("自我要求是迈向成功的捷径，恒心是离成功最短的路。");
        re.add("苦难犹如乌云，远望去但见墨黑一片，然而身临其下时不过是灰色而已。");
        re.add("流水在碰到底处时才会释放活力。");
        re.add("一个最困苦、最卑贱、最为命运所屈辱的人，只要还抱有希望，便无所怨惧。");
        re.add("思路决定出路，气度决定高度，细节决定成败，性格决定命运。");
        re.add("如何与自己和谐相处是人生最高的一门艺术。");
        re.add("勿问成功的秘诀为何，且尽全力做你应该做的事吧。");
        re.add("当我们太忙于低头赶路，以致错过了太多美好的风景。");
        re.add("败尽天下英雄，然后尝尽无穷寂寞。");
        re.add("人得适应一切无法改变的事物，而绝大多数事物都是无法改变的。");
        re.add("勿问成功的秘诀为何，且尽全力做你应该做的事吧。");
        re.add("不幸往往来自比较，而幸福也是来自比较。");
        re.add("流水在碰到底处时才会释放活力。");

        re.add("只知道刚的人，难免会被折断；只有柔的人，到头来终是懦夫。");
        re.add("命需要奋斗，奋斗与不奋斗，造就的结果截然不同。");
        re.add("败尽天下英雄，然后尝尽无穷寂寞。");
        re.add("一个最困苦、最卑贱、最为命运所屈辱的人，只要还抱有希望，便无所怨惧。");
        re.add("一个最困苦、最卑贱、最为命运所屈辱的人，只要还抱有希望，便无所怨惧。");
        re.add("自我要求是迈向成功的捷径，恒心是离成功最短的路。");
        re.add("每一种创伤，都是一种成熟。");
        re.add("一个最困苦、最卑贱、最为命运所屈辱的人，只要还抱有希望，便无所怨惧。");
        re.add("试着每天给自己一个希望，也许生活就会不再一样。");
        re.add("人要有足够的压力，才能超越颠峰。");
        re.add("思路决定出路，气度决定高度，细节决定成败，性格决定命运。");
        re.add("一个最困苦、最卑贱、最为命运所屈辱的人，只要还抱有希望，便无所怨惧。");
        re.add("不幸往往来自比较，而幸福也是来自比较。");
        re.add("路是脚踏出来的，历史是人写出来的。人的每一步行动都在书写自己的历史。");
        re.add("我们不行，往往不是因为我们不行，而是因为别人说了我们不行。");
        re.add("沉默，是一种坚强。稻熟低穗，人熟低声。");
        re.add("不幸往往来自比较，而幸福也是来自比较。");
        re.add("每个人都有潜在的能量，只是很容易被习惯所掩盖，被时间所迷离，被惰性所消磨。");
        re.add("试着每天给自己一个希望，也许生活就会不再一样。");
        re.add("败尽天下英雄，然后尝尽无穷寂寞。");
        re.add("思路决定出路，气度决定高度，细节决定成败，性格决定命运。");
        re.add("什么时候也不要放弃希望，越是险恶的环境越要燃起希望的意志。");
        re.add("不幸往往来自比较，而幸福也是来自比较。");
        re.add("我们不行，往往不是因为我们不行，而是因为别人说了我们不行。");
        re.add("我们不行，往往不是因为我们不行，而是因为别人说了我们不行。");
        re.add("自我要求是迈向成功的捷径，恒心是离成功最短的路。");
        re.add("不幸往往来自比较，而幸福也是来自比较。");
        re.add("一个最困苦、最卑贱、最为命运所屈辱的人，只要还抱有希望，便无所怨惧。");
        re.add("试着每天给自己一个希望，也许生活就会不再一样。");
        re.add("只知道刚的人，难免会被折断；只有柔的人，到头来终是懦夫。");
        re.add("人生没有如果，只有后果和结果。");
        re.add("人生没有如果，只有后果和结果。");
        re.add("因上努力，果上随缘。");
        re.add("少许的主动就可以使你生活中的运气大增。");
        re.add("自弃者扶不起，自强者击不倒。");
        re.add("你必须煞有介事地处理毫无意义，从无意义中创造意义。");
        re.add("人的一生，总是难免有浮沉。不会永远如旭日东升，也不会永远痛苦潦倒。");
        re.add("只知道刚的人，难免会被折断；只有柔的人，到头来终是懦夫。");
        re.add("勿问成功的秘诀为何，且尽全力做你应该做的事吧。");
        re.add("败尽天下英雄，然后尝尽无穷寂寞。");
        re.add("命需要奋斗，奋斗与不奋斗，造就的结果截然不同。");
        re.add("我们选择不了生命，但我们可以选择走过生命的方式。");
        re.add("当你犹豫时，这个世界很大，当你走出第一步时，这个世界很小。");
        re.add("当你犹豫时，这个世界很大，当你走出第一步时，这个世界很小。");
        re.add("没有翻不过的高山，没有走不出的沙漠，更没有超越不了的自我。");
        re.add("流水在碰到底处时才会释放活力。");
        re.add("有勇气并不表示恐惧不存在，而是敢面对恐惧、克服恐惧。");
        re.add("勿问成功的秘诀为何，且尽全力做你应该做的事吧。");
        re.add("当你犹豫时，这个世界很大，当你走出第一步时，这个世界很小。");
        re.add("败尽天下英雄，然后尝尽无穷寂寞。");
        re.add("勿问成功的秘诀为何，且尽全力做你应该做的事吧。");
        re.add("当你犹豫时，这个世界很大，当你走出第一步时，这个世界很小。");
        re.add("不幸往往来自比较，而幸福也是来自比较。");
        re.add("人要有足够的压力，才能超越颠峰。");
        re.add("不要放弃你的幻想，当幻想没有了以后，你还可以生存，但是你虽生犹死。");
        re.add("思路决定出路，气度决定高度，细节决定成败，性格决定命运。");
        re.add("你必须煞有介事地处理毫无意义，从无意义中创造意义。");
        re.add("败尽天下英雄，然后尝尽无穷寂寞。");
        re.add("当你犹豫时，这个世界很大，当你走出第一步时，这个世界很小。");
        re.add("当你犹豫时，这个世界很大，当你走出第一步时，这个世界很小。");
        re.add("你必须煞有介事地处理毫无意义，从无意义中创造意义。");
        re.add("不幸往往来自比较，而幸福也是来自比较。");
        re.add("自我要求是迈向成功的捷径，恒心是离成功最短的路。");
        re.add("思路决定出路，气度决定高度，细节决定成败，性格决定命运。");
        re.add("流水在碰到底处时才会释放活力。");
        re.add("当我们太忙于低头赶路，以致错过了太多美好的风景。");
        re.add("败尽天下英雄，然后尝尽无穷寂寞。");
        re.add("不幸往往来自比较，而幸福也是来自比较。");
        re.add("勿问成功的秘诀为何，且尽全力做你应该做的事吧。");
        re.add("有棱有角的害处是，别人啃起你来十分方便。");
        re.add("流水在碰到底处时才会释放活力。");
        re.add("流水在碰到底处时才会释放活力。");
        re.add("越努力，越幸运。");
        re.add("思路决定出路，气度决定高度，细节决定成败，性格决定命运。");
        re.add("勿问成功的秘诀为何，且尽全力做你应该做的事吧。");
        re.add("败尽天下英雄，然后尝尽无穷寂寞。");
        re.add("苦难犹如乌云，远望去但见墨黑一片，然而身临其下时不过是灰色而已。");
        re.add("败尽天下英雄，然后尝尽无穷寂寞。");
        re.add("我们不行，往往不是因为我们不行，而是因为别人说了我们不行。");
        re.add("有棱有角的害处是，别人啃起你来十分方便。");
        re.add("你必须煞有介事地处理毫无意义，从无意义中创造意义。");
        re.add("流水在碰到底处时才会释放活力。");
        re.add("自我要求是迈向成功的捷径，恒心是离成功最短的路。");
        re.add("思路决定出路，气度决定高度，细节决定成败，性格决定命运。");
        re.add("人的一生，总是难免有浮沉。不会永远如旭日东升，也不会永远痛苦潦倒。");
        re.add("自我要求是迈向成功的捷径，恒心是离成功最短的路。");
        re.add("自我要求是迈向成功的捷径，恒心是离成功最短的路。");
        re.add("不幸往往来自比较，而幸福也是来自比较。");
        re.add("少许的主动就可以使你生活中的运气大增。");
        re.add("人生没有如果，只有后果和结果。");
        re.add("你必须煞有介事地处理毫无意义，从无意义中创造意义。");
        re.add("只知道刚的人，难免会被折断；只有柔的人，到头来终是懦夫。");
        re.add("人要有足够的压力，才能超越颠峰。");
        re.add("败尽天下英雄，然后尝尽无穷寂寞。");
        re.add("思路决定出路，气度决定高度，细节决定成败，性格决定命运。");
        re.add("无论你觉得自己多么的了不起，也永远有人比你更强。");
        re.add("无论你觉得自己多么的了不起，也永远有人比你更强。");
        re.add("人生在世，难免会有困难，面对它，有人退后，有人原地不动，有人跨越它。");
        re.add("思路决定出路，气度决定高度，细节决定成败，性格决定命运。");
        re.add("试着每天给自己一个希望，也许生活就会不再一样。");
        re.add("思路决定出路，气度决定高度，细节决定成败，性格决定命运。");
        re.add("当你犹豫时，这个世界很大，当你走出第一步时，这个世界很小。");
        re.add("败尽天下英雄，然后尝尽无穷寂寞。");
        re.add("试着每天给自己一个希望，也许生活就会不再一样。");
        re.add("思路决定出路，气度决定高度，细节决定成败，性格决定命运。");
        re.add("抬头看天，低头看路。");
        re.add("无论你觉得自己多么的了不起，也永远有人比你更强。");
        re.add("人要有足够的压力，才能超越颠峰。");
        re.add("思路决定出路，气度决定高度，细节决定成败，性格决定命运。");
        re.add("败尽天下英雄，然后尝尽无穷寂寞。");
        re.add("思路决定出路，气度决定高度，细节决定成败，性格决定命运。");
        re.add("当我们太忙于低头赶路，以致错过了太多美好的风景。");
        re.add("无论你觉得自己多么的了不起，也永远有人比你更强。");
        re.add("无论你觉得自己多么的了不起，也永远有人比你更强。");
        re.add("没有人在世界上能够“弃”你，除非你自暴自弃。因为我们是属于自己的，并不属于他人。");
        re.add("走在人生长河中，览人生之快乐，惜生活之光彩，明人生之痛苦，思人生之纯洁。");
        re.add("试着每天给自己一个希望，也许生活就会不再一样。");
        re.add("有棱有角的害处是，别人啃起你来十分方便。");
        re.add("有勇气并不表示恐惧不存在，而是敢面对恐惧、克服恐惧。");
        re.add("人要有足够的压力，才能超越颠峰。");
        re.add("不幸往往来自比较，而幸福也是来自比较。");
        re.add("不幸往往来自比较，而幸福也是来自比较。");
        re.add("你必须煞有介事地处理毫无意义，从无意义中创造意义。");
        re.add("自我要求是迈向成功的捷径，恒心是离成功最短的路。");
        re.add("不幸往往来自比较，而幸福也是来自比较。");
        re.add("不幸往往来自比较，而幸福也是来自比较。");
        re.add("有勇气并不表示恐惧不存在，而是敢面对恐惧、克服恐惧。");
        re.add("有棱有角的害处是，别人啃起你来十分方便。");
        re.add("勿问成功的秘诀为何，且尽全力做你应该做的事吧。");
        re.add("败尽天下英雄，然后尝尽无穷寂寞。");
        re.add("苦难犹如乌云，远望去但见墨黑一片，然而身临其下时不过是灰色而已。");
        re.add("不幸往往来自比较，而幸福也是来自比较。");
        re.add("不幸往往来自比较，而幸福也是来自比较。");
        re.add("自我要求是迈向成功的捷径，恒心是离成功最短的路。");
        re.add("命需要奋斗，奋斗与不奋斗，造就的结果截然不同。");
        re.add("不幸往往来自比较，而幸福也是来自比较。");
        re.add("真正的快乐，多数时候与金钱无关。");
        re.add("少许的主动就可以使你生活中的运气大增。");
        return re;
    }
}
